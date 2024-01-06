package com.parthu;

public class StringSwapping {

	public static void main(String[] args) {

		String str = "Hi this is am parthu";
        String[] split = str.trim().split(" ");
        String temp="";
        for(int i=0;i<split.length;i++) {
        	if(i%2!=0) {
        		temp=split[i];
        		split[i]=split[3];
        		split[3]=temp;
        	}
        	else {
        		
        	}
        	System.out.println(split[i]);
        }
	}
}
