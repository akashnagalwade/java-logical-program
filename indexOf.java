package Interview;

import java.util.Scanner;

//Ashish Singh
//n
//9

public class indexOf {

	static int indexOf(String s, String c) {

		char key = c.charAt(0);
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == key) {
				return i;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();// input name
		String c = scan.next();// input character

		System.out.println(indexOf(s, c));
	}
}
