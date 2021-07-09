package leetcode.practice;

/* Longest substring with Non repetitive character */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class LongSubString {

    public int lengthOfLongestSubstring(String s){

        int n = s.length(), ans = 0;

        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String str = bufferedReader.readLine();
        LongSubString lss=new LongSubString();
        System.out.println(lss.lengthOfLongestSubstring(str));


    }
}
