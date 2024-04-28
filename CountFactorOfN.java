package Interview;

import java.util.Scanner;

public class CountFactorOfN {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int count = 0;
	for(int i=1; i<=n; i++) {
		if(n%i == 0) {
			System.out.print(i+" ");
			count++;
		}
	}
	
	System.out.println();
	System.out.println("Count:" +count);
}
}
