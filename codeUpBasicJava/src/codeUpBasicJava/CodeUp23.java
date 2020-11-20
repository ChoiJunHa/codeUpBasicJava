package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String sp[] = input.split("\\.");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
	}
}
