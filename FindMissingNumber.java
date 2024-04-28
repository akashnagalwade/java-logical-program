package Interview;

import java.util.Scanner;

public class FindMissingNumber {

	static int findMissingNum(int[] a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		// System.out.println(sum);
		int n = a.length + 1;
		int sum1 = n * (n + 1) / 2;

		return sum1 - sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println(findMissingNum(a));

	}
}
