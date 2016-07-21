package com.sparg.java;

import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author: vimal.sengoden
 * Date: 7/18/2016
 * Time: 5:04 PM
 */
public class TestLargeFileReading {
    public static final File file = new File("C:\\Users\\vimal.sengoden\\Desktop\\test-final.csv");

    public static void main(String[] args) {
        System.out.println("Going to read file");
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Awake to read file");
        FileChannel channel = null;
        long time = System.currentTimeMillis();
        try {
            channel = new FileInputStream(file).getChannel();
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            System.out.println("MappedByteBuffer Capacity: " + buffer.capacity());
            StringBuilder sb = new StringBuilder();

            byte[] bytes = new byte[20000];

            int count = 0;
            int line = 0;
            while(buffer.hasRemaining()) {
                bytes[count] = buffer.get();
                if(((char)bytes[count]) == '\n') {
                    System.out.print((line++) + "Read new line : " + new String(ArrayUtils.subarray(bytes, 0, count+1), StandardCharsets.UTF_8));
                    count=0;
                } else {
                    count++;
                }
            }
            System.out.println("Timetaken " + (System.currentTimeMillis()-time));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // when finished
            if(channel != null) {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
