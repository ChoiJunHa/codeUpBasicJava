package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String sp[] = input.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println("'" + sp[i] + "'");
		}
	}
}
