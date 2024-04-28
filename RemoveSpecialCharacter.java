package Interview;

import java.util.Scanner;

//Aksh#$@123
//Aksh123

public class RemoveSpecialCharacter {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println(removeCharacter(s));
	}

	static String removeCharacter(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {

				res = res + s.charAt(i);
			}
		}
		return res;
	}

}
