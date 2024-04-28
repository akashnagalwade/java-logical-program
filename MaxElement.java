package Interview;

import java.util.Scanner;

public class MaxElement {
	static int maxEle(int[] ar) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}
	
	static int minEle(int[] ar) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		System.out.println(maxEle(ar));
		System.out.println(minEle(ar));
	}
}
