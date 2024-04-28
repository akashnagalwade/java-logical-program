package Interview;

import java.util.Scanner;

//12 34 23
//34

public class Largest3Integer {
	static void largestInt(int n,int m,int l) {
		
		int x = Math.max(n,m);
		System.out.println(Math.max(l, x));
	}
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int l = scan.nextInt();
	
	largestInt(n, m, l);
}
}
