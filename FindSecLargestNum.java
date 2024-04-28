package Interview;

import java.util.Scanner;

public class FindSecLargestNum {

	public static int getSecondLargest(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length-2];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		 int[] a = new int[n];
		 
		 for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		 
		System.out.println(getSecondLargest(a));

	}
}
