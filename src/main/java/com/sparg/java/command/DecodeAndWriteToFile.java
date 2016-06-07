package com.sparg.java.command;

import java.io.File;

import com.sparg.java.file.utils.WriteToFile;
import org.apache.commons.io.FileUtils;

/**
 * @author: vimal.sengoden
 * Date: 11/14/2014
 * Time: 6:03 PM
 */
public class DecodeAndWriteToFile {


    public static String BASE64_ENCODED_CONTENT = "base64EncodedContent.txt";
    public static String OUTPUT_FILE = "decoded_content.txt";

    public static void main(String[] args) {
        try {
            byte[] encodedBytes = FileUtils.readFileToByteArray(new File(Thread.currentThread().getContextClassLoader().getResource(BASE64_ENCODED_CONTENT).toURI()));
            WriteToFile.writeBase64DecodedToFile(encodedBytes, OUTPUT_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
