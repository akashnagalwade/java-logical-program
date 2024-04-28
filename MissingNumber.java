package Interview;

import java.util.HashSet;

public class MissingNumber {
	static HashSet missingNumber(int[] a) {//using Sorted Array
		int ft = 0;
		int st = 0;
		HashSet<Integer> list = new HashSet<Integer>();
		
		for(int i =0; i<a.length-1;i++) {
			int temp = 0;
			ft = a[i];
			st = a[i+1];
			if((ft-st)!= -1) {
				temp = st-1;
				list.add(temp);
			}
		}
		return list;
	}
public static void main(String[] args) {
	
	int a[] = {20,22,23,24,26,27,29,30};
	
	System.out.println(missingNumber(a));
	
}
}
