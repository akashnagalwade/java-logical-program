package Interview;

import java.util.Scanner;

public class PrimeOrNot {
	// prime numbers are 2,3,5,7,11....and so on.
	//suppose ex. value is 5 5/2 =2 after check is greater or not
	// then 5%2 == 1 it means remainder not gives 0 that why 
	//its not prime number
	
	static String primeOnot(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) { //it will check the remainder == 0
				return "Not Prime";
			}
		}
		return "Prime";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(primeOnot(n));
	}
}
