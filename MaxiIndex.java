package Interview;

import java.util.Scanner;

public class MaxiIndex {
	
	static int maxiIndex(int[] ar){
		int max = Integer.MIN_VALUE;
		int maxindex = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>max) {
				max = ar[i];
				maxindex =i;
			}
		}
		return maxindex;
	}
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int[] ar = new int[n];
	
	for (int i = 0; i < ar.length; i++) {
		ar[i] = scan.nextInt();
	}
	
	System.out.println(maxiIndex(ar));
	
}
}
