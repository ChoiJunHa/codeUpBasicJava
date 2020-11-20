package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp80 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += i;
			if (sum >= a) {
				System.out.println(i);
				break;
			}
		}
	}
}
