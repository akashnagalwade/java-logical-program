package Interview;

import java.util.Scanner;

public class reverseOrder {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	while(n>0) {
		int rem = n%10;
		System.out.print(rem);
		n=n/10;
	}	
}
}
