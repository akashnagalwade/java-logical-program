package Interview;

import java.util.Scanner;

// Write Array Program in Ascending Order

public class SortingArray {

	static void sortArray(int[] ar, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.print(ar[i] + " ");
		}
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		sortArray(ar, n);
	}
}
