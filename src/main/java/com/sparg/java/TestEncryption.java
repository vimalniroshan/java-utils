package com.sparg.java;

import com.sparg.java.encryption.utils.Encryption;

import java.sql.Timestamp;


/**
 * @author: vimal.sengoden
 * Date: 6/7/2016
 * Time: 11:25 AM
 */
public class TestEncryption {

	public static void main(String[] args) throws Exception {
		System.out.println(Encryption.encrypt("$", Encryption.EncryptionType.DEFAULT));
		System.out.println(Encryption.decrypt("ghBMauWMb/BlJAVrxW59sQ==", Encryption.EncryptionType.DEFAULT));

		System.out.println(new Timestamp(System.currentTimeMillis()));
	}
}
