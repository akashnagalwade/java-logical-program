package Interview;

import java.util.Scanner;

//adj3545@#afio
//adj3545afio@#

public class arrangeSpecialCharacter {
	static String arrngCharacter(String s) {
		String res = "";
		String res1 = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {

				res = res + ch;
			} else {
				res1 = res1 + ch;
			}
		}
		return res + res1;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println(arrngCharacter(s));
	}
}
