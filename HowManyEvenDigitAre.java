package Interview;

import java.util.Scanner;

public class HowManyEvenDigitAre {
	public static int printEvenDigit(int n) {
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
		//System.out.println(count);
	}
	
	public static int printOddDigit(int n) {
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
		//System.out.println(count);
	}
	
	public static void printOnlyEvenDigit(int n) {
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				System.out.println(rem);
			}
			n = n / 10;
		}
		return;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		//System.out.println(printEvenDigit(n));
		//System.out.println(printOddDigit(n));
		printOnlyEvenDigit(n);
		
		
	}
}
