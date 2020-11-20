package codeUpBasicJava;
import java.util.Scanner;

public class CodeUp27 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();

		String[] time = input.split("\\.");
		int y = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		int d = Integer.parseInt(time[2]);

		System.out.printf("%02d-%02d-%04d", d, m, y);

	}
}

