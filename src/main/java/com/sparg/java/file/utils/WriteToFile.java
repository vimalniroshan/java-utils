package com.sparg.java.file.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

/**
 * @author: vimal.sengoden
 * Date: 11/14/2014
 * Time: 2:37 PM
 */
public class WriteToFile {

    public static void writeBase64DecodedToFile(byte[] base64EncodedByte, String absoluteFileName) throws IOException {
        byte[] bytes = Base64.decodeBase64(base64EncodedByte);
        FileUtils.writeByteArrayToFile(new File(absoluteFileName), bytes);
    }

    public static void writeBase64EncodedToFile(byte[] plaintText, String absoluteFileName) throws IOException {
        byte[] bytes = Base64.encodeBase64(plaintText);
        FileUtils.writeByteArrayToFile(new File(absoluteFileName), bytes);
    }

}
