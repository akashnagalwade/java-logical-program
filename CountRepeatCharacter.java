package Interview;

import java.util.Scanner;

//Akash nagalwade
//a
//4
public class CountRepeatCharacter {
	
	static int countChar(String s, char key)
	{
		int count = 0;
		for(int i = 0; i < s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == key)
			{
				count++;
			}
		}
		return count;	
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String s = scan.nextLine();
	String s1 = scan.next();
	
	char key = s1.charAt(0);
	
	countChar(s,key);
	System.out.println(countChar(s,key));
 }
}
