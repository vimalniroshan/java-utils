package com.sparg.java.command;

import java.io.File;

import com.sparg.java.file.utils.WriteToFile;
import org.apache.commons.io.FileUtils;

/**
 * @author: vimal.sengoden
 * Date: 4/20/2015
 * Time: 10:40 AM
 */
public class WriteToPDF {

    public static String BASE64_ENCODED_CONTENT = "base64encoded_pdf_content.txt";
    public static String PDF_FILE_NAME = "output.pdf";

    public static void main(String[] args) {
        try {
            byte[] encodedBytes = FileUtils.readFileToByteArray(new File(Thread.currentThread().getContextClassLoader().getResource(BASE64_ENCODED_CONTENT).toURI()));
            WriteToFile.writeBase64DecodedToFile(encodedBytes, PDF_FILE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
