package Interview;

import java.util.Scanner;

//30
//1 2 3 5 6 10 15 30 

public class FactorOfN {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	for(int i=1; i<=n; i++) {
		if(n%i == 0) {
		System.out.print(i+" ");
		}
	}
}
}
