package Interview;

import java.util.Scanner;

public class UpperCharacter {

	static void character(int n) {

		if (n >= 65 && n <= 90) {
			System.out.println((char) n);
		} else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();	
			character(n);
		} catch (Exception e) {
			System.out.println("Please provide number Input");
		}
	}
}
