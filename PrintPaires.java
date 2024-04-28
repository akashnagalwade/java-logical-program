package Interview;

import java.util.Scanner;

public class PrintPaires {

	static void printAllPaires(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				System.out.println(a[i] + " " + a[j]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		printAllPaires(a);
	}

}
