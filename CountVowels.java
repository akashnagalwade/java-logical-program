package Interview;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch =='a'||ch =='e'|| ch =='i'||ch =='o'||ch =='u'
			||ch =='A'||ch =='E'|| ch =='I'||ch =='O'||ch =='U') {
				count++;
			}
		}
		System.out.println(count);	
	}
}
