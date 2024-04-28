package Interview;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			System.out.print(rem + " ");
			n = n / 10;
		}
	}
}
