package com.sparg.java.command;

import java.io.File;

import com.sparg.java.file.utils.WriteToFile;
import org.apache.commons.io.FileUtils;

/**
 * @author: vimal.sengoden
 * Date: 3/27/2015
 * Time: 2:58 PM
 */
public class EncodeAndWriteToFile {

    public static String PLAIN_TEXT_FILE_NAME = "plain_text_file.xml";
    public static String BASE64_ENCODED_CONTENT = "base64EncodedContent.txt";

    public static void main(String[] args) {
        try {

            byte[] encodedBytes = FileUtils.readFileToByteArray(new File(Thread.currentThread().getContextClassLoader().getResource(PLAIN_TEXT_FILE_NAME).toURI()));
            WriteToFile.writeBase64EncodedToFile(encodedBytes, BASE64_ENCODED_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
