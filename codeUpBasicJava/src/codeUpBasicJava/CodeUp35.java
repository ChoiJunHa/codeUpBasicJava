package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sd = Integer.valueOf(s.next(), 16);
		System.out.println(Integer.toOctalString(sd));
	}
}
