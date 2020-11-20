package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp76 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.nextLine().charAt(0);
		char t = 'a';
		for (t = 'a'; t <= a; t++) {
			System.out.print(t + " ");
		}

	}
}
