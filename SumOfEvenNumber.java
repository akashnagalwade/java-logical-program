package Interview;

import java.util.Scanner;

public class SumOfEvenNumber {
	static int printSumEven(int[] a) {
		
	int Evensum = 0;
	for(int i=0; i<a.length; i++) {
		if(a[i]%2 == 0) {
			Evensum = Evensum + a[i];
		}
	}
	return Evensum;
}
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int[] a = new int[n];
	for(int i=0; i<a.length;i++) {
		a[i] = scan.nextInt();
	}
	System.out.println(printSumEven(a));
}
}
