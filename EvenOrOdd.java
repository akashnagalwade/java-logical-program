package Interview;

import java.util.Scanner;

public class EvenOrOdd {
	
	static String evenOrOdd(int n){
		if(n%2==0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	String res = evenOrOdd(n);
	System.out.println(res);
	
}
}
