package Interview;

import java.util.Scanner;

public class SwapNumber {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int x = scan.nextInt();
	System.out.println("Enter second Number");
	int y = scan.nextInt();
	
	x = x + y;
	y = x - y;
	x = x - y;
	
	System.out.println("After swap "+x+" "+y);
	
}
}
