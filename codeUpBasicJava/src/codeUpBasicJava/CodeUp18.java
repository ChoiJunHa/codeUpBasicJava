package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] mobNum = str.split(":");
		String ret1 = mobNum[0];
		String ret2 = mobNum[1];
		System.out.println(ret1 + ":" + ret2);
	}
}
