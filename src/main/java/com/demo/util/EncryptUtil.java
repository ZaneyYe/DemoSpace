package com.demo.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
public class EncryptUtil {

	private static KeyGenerator desKeyGenerator = null;
	private static  SecretKey desSecretKey = null;
	private static  Cipher desCipher = null;

	static {
		try {
			desKeyGenerator = KeyGenerator.getInstance("des");
			desSecretKey = desKeyGenerator.generateKey();
			desCipher = Cipher.getInstance("des");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *  原文转换成译文
	 * @param ori
	 * @return
	 */
	public static String encryptDes(String ori){
		if(StringUtils.isBlank(ori)){
			return "";
		}
		try {
			desCipher.init(Cipher.ENCRYPT_MODE, desSecretKey);
			byte[] bytes = desCipher.doFinal(ori.getBytes());
			return new String(Base64.encodeBase64(bytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 译文转成原文
	 * @param cipher
	 * @return
	 */
	public static String decryptDes(String cipher){
		if(StringUtils.isBlank(cipher)){
			return "";
		}
		byte[] desResultBytes = Base64.decodeBase64(cipher);
		try {
			desCipher.init(Cipher.DECRYPT_MODE, desSecretKey);
			byte[] results = desCipher.doFinal(desResultBytes);
			return new String(results);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}


}
