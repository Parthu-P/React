package com.parthu.practice;

public class StringDemo2 {

    public static void main(String[] args) {

        String str = "parthasaradhi";
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
