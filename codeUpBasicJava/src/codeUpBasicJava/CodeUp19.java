package codeUpBasicJava;

import java.util.Scanner;

public class CodeUp19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] mobNum = str.split("\\.");
		int ret1 = Integer.parseInt(mobNum[0]);
		int ret2 = Integer.parseInt(mobNum[1]);
		int ret3 = Integer.parseInt(mobNum[2]);
		System.out.printf("%04d.%02d.%02d", ret1, ret2, ret3);
	}
}
