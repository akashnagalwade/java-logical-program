package Interview;

import java.util.Scanner;

public class PrintOnlySequancewithoutrepeatnumber {

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] != ar[i + 1]) {
				System.out.println(ar[i]);
			}
		}
		System.out.println(ar[ar.length-2]);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		print(a);
	}
}
