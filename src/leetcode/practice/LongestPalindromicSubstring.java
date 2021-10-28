package leetcode.practice;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Ente new string: ");
            String val=scanner.next();
            System.out.println(longestPalindrome(val));
        }
    }
    public static String longestPalindrome(String str){
        int start =0,end=0;
        for (int i=0;i<str.length();i++){
            int even=expand(str,i,i+1);
            int odd=expand(str,i,i);
            int len=Math.max(even,odd);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return str.substring(start,end+1);
    }

    private static int expand(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
