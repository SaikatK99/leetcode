package leetcode.practice;

/* "Abcd" is true
   "abcd" is true
   "ABCD" is true
   "AbCd" or "abCd" or "abCD" id false
*/

import java.util.Scanner;

public class DetectCapital {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String: ");
        String line=scanner.next();
        for (int i=0;i<line.length();i++){
          if (line.charAt(i)>='a' && line.charAt(i)<='z' && i==0){

          }

        }

    }
}
