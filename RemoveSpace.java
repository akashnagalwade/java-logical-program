package Interview;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
    	String str =scan.nextLine();
    	
        String op = str.replace(" ","");
        System.out.println(op);
	}
}
