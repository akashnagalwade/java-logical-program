package Interview;

//Akash Nagalwade Nagpur pune
//3

import java.util.Scanner;

public class CountSpace {

	static int countSpace(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		countSpace(s);
		System.out.println(countSpace(s));

	}
}
