package Interview;

import java.util.Iterator;
import java.util.Scanner;

public class PrintEvenOnly {
	
	static void printEven(int n) {
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	static void printOdd(int n) {
		for (int i = 0; i <=n; i++) {
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
		}
	}
//	10
//	1 3 5 7 9 
	
	static void printReverse(int n) {
		for (int x =n; x >=1; x--) {
			System.out.print(x+" ");
		}
	}
	
	static void printMultiOf(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(i*3+" ");
		}
	}
	static void printTable(int n) {
		for (int i = 1; i <=10; i++) {
			System.out.println(n +"x"+i+ " = " +n*i+" ");
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
    // printEven(n);
	//printOdd(n);
	//printReverse(n);
	//printMultiOf(n);
	printTable(n);
}
}
