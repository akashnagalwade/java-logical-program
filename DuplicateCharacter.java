package Interview;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i + 1; j < str.length(); j++) {
				int count = 0;
				
				if (ch[i] == ch[j] && ch[i] != ' ') {
					System.out.print(ch[i]);
					count++;
					break;
				}
			}
		}

	}
}
