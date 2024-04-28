package Interview;

import java.util.Scanner;

public class IndexOfCharacter {
	
	static int charIndex(String s, char ch) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)== ch) {
				return i; 
			}
		}
		return -1;
	}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	char ch = scan.next().charAt(0);
	
	System.out.println(charIndex(s,ch));
	
}
}
