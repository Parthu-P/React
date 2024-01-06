package com.parthu.practice;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Demo {

	public static void main(String[] args) {

		String pwd="parthusd";
		
		Encoder encoder=Base64.getEncoder();
		byte[] encode=encoder.encode(pwd.getBytes());
		String enpwd = new String(encode);
		System.out.println(enpwd);
		
		Decoder decoder=Base64.getDecoder();
		byte[] decode=decoder.decode(enpwd);
		String string = new String(decode);
		System.out.println(decode);
	}

}
