package example.classes.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Security {
	public static String getMd5Hash(String string) {
		String out = "oblom";
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(string.getBytes());
			byte[] bytes = md.digest();
			out = DatatypeConverter.printHexBinary(bytes);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return out;
	}
}
