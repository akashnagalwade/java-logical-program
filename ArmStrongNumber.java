package Interview;

import java.util.Scanner;

// 153= 1*1*1 + 5*5*5 + 3*3*3 = 153 is Armstrong
// 155= 1*1*1 + 5*5*5 + 5*5*5 = 251 is not Armstrong
// 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634 its arm strong number

public class ArmStrongNumber {

	public static void armStrong(int n) {
		int t1 = n;
		int len = 0;

		while (t1 != 0) {
			len = len + 1;
			t1 = t1 / 10;
		}
		int t2 = n;
		int arm = 0;
		int rem;

		while (t2 != 0) {
			int mul = 1;
			rem = t2 % 10;

			for (int i = 1; i <= len; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == n) {
			System.out.println("its ArmStrong Number ");
		} else {
			System.out.println("It's Not ArmStrong Number.. ");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		armStrong(n);
	}
}
