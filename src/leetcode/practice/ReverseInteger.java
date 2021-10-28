package leetcode.practice;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("No: ");
        int no=scanner.nextInt();
        int x,temp,rev=0;
        while (no!=0){
            x=no%10;
            no=no/10;
            temp=rev*10+x;
            rev=temp;
        }
        System.out.println(rev);
    }
}
