package Interview;

//10
//1 2 3 5 8 13 21 34 55 89 

import java.util.Scanner;

public class Fibonnaci {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int a = 1;
	int b = 1;
	int c = 2;
	
	for(int i =0; i<n; i++) {
		a = b;
		b = c;
		c = a+b;
		System.out.print(a+" ");
	}
}
}
