package com.parthu.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class PwdUtil {
	public static String generatedRamdomPwd() {
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String pwd = RandomStringUtils.random(6, characters);
		return pwd;

	}
}
