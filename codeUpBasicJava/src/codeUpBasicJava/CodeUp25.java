package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		System.out.println("[" + (input / 10000) + "0000" + "]");
		input = input - (input / 10000) * 10000;
		System.out.println("[" + (input / 1000) + "000" + "]");
		input = input - (input / 1000) * 1000;
		System.out.println("[" + (input / 100) + "00" + "]");
		input = input - (input / 100) * 100;
		System.out.println("[" + (input / 10) + "0" + "]");
		input = input - (input / 10) * 10;
		System.out.println("[" + (input / 1) + "]");
	}
}
