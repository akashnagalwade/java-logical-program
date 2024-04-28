package Interview;

import java.util.Scanner;

//AKASH Nagalwade
//8
//	countLowerCase()	

public class CountLoweCase {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i <s.length() ; i++)
		{
			char ch = s.charAt(i);
			if( ch>= 'a' && ch <='z')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
