package com.parthu.practice;

public class StringOccurence {

	public static void main(String[] args) {

		String str = "parthasaradhiardsa";
		String str1 = "";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				Integer num = Integer.valueOf(i);
				num=count;
				str1+=num;
				count++;
			} else {
				str1 += str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
