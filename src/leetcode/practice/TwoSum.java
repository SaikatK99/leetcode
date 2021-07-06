package leetcode.practice;

import java.io.IOException;

public class TwoSum {
    public static void main(String[] args)throws IOException {
        int nums[]={2,7,11,15};
        int target;
        target = 26;

        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    System.out.println("Position is : "+i+" "+j);
                }
            }
        }

    }

}
