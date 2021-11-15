package leetcode.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String primeNumber="";
        System.out.println("Number: ");
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i=1;i<=num;i++){
            int counter=0;
            for (int j=i;j>=1;j--){
                if (i%j==0){
                    counter++;
                }
            }
            if (counter==2){
                primeNumber=primeNumber+i+" ";
            }
        }
        System.out.println(primeNumber);
    }
}
