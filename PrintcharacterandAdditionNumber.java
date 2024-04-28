package Interview;

import java.util.Scanner;

public class PrintcharacterandAdditionNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println(printCharacterAddition(s));
	}

	static String printCharacterAddition(String s) {
		String res = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				res = res + ch;

			} else if (ch >= '0' && ch <= '9') {
				sum = sum + (ch-48);

			}
		}
		return res + sum;
	}
}
