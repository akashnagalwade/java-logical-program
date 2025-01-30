package Interview;

import java.util.HashSet;

public class LongestSubString {

    static int longSubString(String s){
        int start = 0;
        int end = 0;

        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();
        while(start < s.length()){
            if(!set.contains(start)){
                set.add(s.charAt(start));
                start++;
                maxLength = Math.max(maxLength, set.size());
            }else{
                set.remove(s.charAt(end));
                end++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abacd";

        System.out.println(longSubString(s));

    }
}
