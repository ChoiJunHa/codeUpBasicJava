package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp26 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String[] time = input.split(":");
		System.out.println(Integer.parseInt(time[1]));
	}
}
