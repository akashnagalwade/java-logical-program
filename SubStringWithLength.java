package Interview;

import java.util.Scanner;

public class SubStringWithLength {

	public static void printSubString(String s, int l) {

		for (int i = 0; i <= s.length()-l; i++) {
			String t = "";
			for (int j = i; j < i+l; j++) {
				t = t + s.charAt(j);
			}
			System.out.println(t);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int l = scan.nextInt();

		printSubString(s, l);
	}
}
