package kr.co.drdog.test;

import java.security.NoSuchAlgorithmException;

import com.crypto.util.SHA256;

public class SHA256Test {
	public static void main(String[] args) throws NoSuchAlgorithmException{
		String pwd = "12345";
		String cryPwd = SHA256.encrypt(pwd);
		System.out.println(pwd+" -> "+cryPwd);
		System.out.println("글자수 : "+cryPwd.length());
	}
}
