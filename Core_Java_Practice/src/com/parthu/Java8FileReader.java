package com.parthu;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Java8FileReader {

	public static void main(String[] args) {

		System.out.println("Today");
		String file = "f2.txt";
		try (Stream<String> stream = Files.lines(Paths.get(file))) {
			stream.forEach(i -> System.out.println(i));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
