package com.parthu.practice;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class StreanFilesdemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		String name = "com/parthu/Pattern";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource(name);

		if(url!=null) {
		try {
			InputStream stream = url.openStream();
			Scanner sc = new Scanner(stream);
			int count = 0;

			while (sc.hasNext()) {
				sc.next();
				count++;
			}
			System.out.println(name + "   " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else {
			System.out.println("Package is not found");
		}
	}
}
