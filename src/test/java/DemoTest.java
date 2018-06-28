import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.sql.Date;


/**
 * Created by yezhangyuan on 2017-12-11.
 *
 * @author yezhangyuan
 */
public class DemoTest {

	public static void main(String[] args){

//		System.out.println("test");
		java.util.Date date = new java.util.Date();
		Date sqlDate = new Date(date.getTime());
		System.out.println(sqlDate);

	}


	@Test
	public void run() throws Exception{
//		assert true == true;
		KeyGenerator desKeyGenerator = KeyGenerator.getInstance("des");
		SecretKey desSecretKey = desKeyGenerator.generateKey();

		Cipher desCipher = Cipher.getInstance("des");
		desCipher.init(Cipher.ENCRYPT_MODE, desSecretKey);
		byte[] dseResultBytes = desCipher.doFinal("hello".getBytes());

		byte[] bytes = Base64.encodeBase64(dseResultBytes);
		System.out.print("des 加密 : { " + new String(bytes) + " }\n\r");

		desCipher.init(Cipher.DECRYPT_MODE, desSecretKey);
		dseResultBytes = Base64.decodeBase64(bytes);
		dseResultBytes = desCipher.doFinal(dseResultBytes);
		System.out.print("des 解密: { " + new String(dseResultBytes) + " }\n\r");
	}



}
