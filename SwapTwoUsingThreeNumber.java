package Interview;

import java.util.Scanner;

public class SwapTwoUsingThreeNumber {
	public static void main(String[] args) {

		int x;
		int y;
		int temp;

		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		temp = x;
		x = y;
		y = temp;

		System.out.println("Swapping " + x + " " + y);
	}
}
