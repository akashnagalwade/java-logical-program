package Interview;

import java.util.Scanner;

public class pattern1 {

	public static void patternF(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	*****
//	*****
//	*****
//	*****
//	*****

	public static void pattern2(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	01234
//	01234
//	01234
//	01234
//	01234

	public static void pattern3(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

//	00000
//	11111
//	22222
//	33333
//	44444

	public static void pattern4(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//	* * * * * * 
//	*         * 
//	*         * 
//	*         * 
//	*         * 
//	* * * * * * 

	public static void pattern5(int n) {

		int count = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (count < 10) {
					System.out.print("0");
				}
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

//	01 02 03 04 05 
//	06 07 08 09 10 
//	11 12 13 14 15 
//	16 17 18 19 20 
//	21 22 23 24 25 

	public static void pattern6(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i * j < 10) {
					System.out.print("0");
				}
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

//	01 02 03 04 05 
//	02 04 06 08 10 
//	03 06 09 12 15 
//	04 08 12 16 20 
//	05 10 15 20 25 

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print((i + j) + 1 + " ");
			}
			System.out.println();
		}
	}

//	1 2 3 4 5 
//	2 3 4 5 6 
//	3 4 5 6 7 
//	4 5 6 7 8 
//	5 6 7 8 9 

	public static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	* 
//	* * 
//	* * * 
//	* * * *

	public static void pattern9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	0 
//	0 1 
//	0 1 2 
//	0 1 2 3 

	public static void pattern10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 

	public static void pattern11(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < (n - 1) - i; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	    *
//	   **
//	  ***
//	 ****

	public static void pattern12(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < (n - 1) - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	    * 
//	   * * 
//	  * * * 
//	 * * * * 

	public static void pattern13(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < (n - 1) - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//    * 
//   * * 
//  *   * 
// *     * 
//* * * * * 

	public static void pattern14(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < (n - 1) - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == n - 1) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//    0 
//   0 1 
//  0   2 
// 0     3 
//0 1 2 3 4 
	public static void pattern15(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == n - 1) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//	0 
//	0 1 
//	0   2 
//	0     3 
//	0 1 2 3 4 

	public static void pattern16(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == n - 1) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//	0 
//	1 1 
//	2   2 
//	3     3 
//	4 4 4 4 4 

	public static void pattern17(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
	}

//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 

	public static void pattern18(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (2 * i) - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	* 
//	* * * 
//	* * * * * 
//	* * * * * * * 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		pattern18(n);
	}
}
