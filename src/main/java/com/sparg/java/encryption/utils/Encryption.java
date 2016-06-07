package com.sparg.java.encryption.utils;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: vimal.sengoden
 * Date: 11/14/2014
 * Time: 11:20 AM
 */
public class Encryption {

    private static Logger logger = LogManager.getLogger(Encryption.class);

    private static final String ENCRYPTED_VALUE_PREFIX = "ENC(";
    private static final String ENCRYPTED_VALUE_SUFFIX = ")";

    private static final String ALGORITHM = "PBKDF2WithHmacSHA1";
    private static final String SECRET_KEY_ALGORITHM = "AES";
    private static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static String initializationVector = "1234567891234567";
    private static int pswdIterations = 65536;
    private static int keySize = 256;

    public static enum EncryptionType{
        DEFAULT("salt", "password");

        private String salt;
        private String password;

        private EncryptionType(final String salt, final String password) {
            this.salt = salt;
            this.password = password;
        }

        public String getSalt() {
            return salt;
        }

        public String getPassword() {
            return password;
        }
    }

    public static String decrypt(String encryptedText, EncryptionType encryptionType) {
        if (StringUtils.isEmpty(encryptedText)) {
            return null;
        }

        byte[] decryptedTextBytes = null;
        try {
            byte[] saltBytes = encryptionType.getSalt().getBytes(StandardCharsets.UTF_8);
            byte[] ivBytes = initializationVector
                    .getBytes(StandardCharsets.UTF_8);
            byte[] encryptedTextBytes = Base64.decodeBase64(encryptedText);

            // Derive the key, given password and salt.
            SecretKeyFactory factory = SecretKeyFactory.getInstance(ALGORITHM);
            PBEKeySpec spec = new PBEKeySpec(encryptionType.getPassword().toCharArray(), saltBytes,
                    pswdIterations, keySize);

            SecretKey secretKey = factory.generateSecret(spec);
            SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(),
                    SECRET_KEY_ALGORITHM);

            // Decrypt the message, given derived key and initialization vector.
            Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(
                    ivBytes));
            decryptedTextBytes = cipher.doFinal(encryptedTextBytes);
        } catch (Exception e) {
            logger.error("Error while decrypt : {} ", encryptedText, e);
        }

        return new String(decryptedTextBytes);
    }

    public static String encrypt(String plainText, EncryptionType encryptionType) throws Exception {
        if (plainText == null) {
            return null;
        }

        byte[] saltBytes = encryptionType.getSalt().getBytes(StandardCharsets.UTF_8);
        byte[] ivBytes = initializationVector.getBytes(StandardCharsets.UTF_8);

        // Derive the key, given password and salt.
        SecretKeyFactory factory = SecretKeyFactory.getInstance(ALGORITHM);
        PBEKeySpec spec = new PBEKeySpec(encryptionType.getPassword().toCharArray(), saltBytes,
                pswdIterations, keySize);

        SecretKey secretKey = factory.generateSecret(spec);
        SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(),
                SECRET_KEY_ALGORITHM);

        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secret, new IvParameterSpec(ivBytes));

        byte[] encryptedTextBytes = cipher.doFinal(plainText
                .getBytes(StandardCharsets.UTF_8));
        return new Base64().encodeAsString(encryptedTextBytes);
    }

}
