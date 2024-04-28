package Interview;

import java.util.Scanner;

public class PalindromeOrNot {
	static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j)
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();		
		System.out.println(isPalindrome(s));
	}

}
