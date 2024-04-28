package Interview;

import java.util.Scanner;

//AADDCSEDD
//3
//Akashh Nagalwaade
//2
public class CountRepeatedCharacter {
	
	static int alternatingCharacters(String s)
	{
		int count = 0;
		for(int i =1; i <s.length()-1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(alternatingCharacters(s));
	}
}
