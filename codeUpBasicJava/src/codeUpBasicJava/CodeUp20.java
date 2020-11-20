package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] mobNum = str.split("-");
		System.out.println(mobNum[0] + mobNum[1]);
	}
}
