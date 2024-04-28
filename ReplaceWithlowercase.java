package Interview;

import java.util.Scanner;

public class ReplaceWithlowercase {
	public static String replaceLowerCase(String s) {

		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				res = res + '#';
			}else{
				res = res + ch;
				System.out.println(res);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		System.out.println(replaceLowerCase(s));

	}
}
