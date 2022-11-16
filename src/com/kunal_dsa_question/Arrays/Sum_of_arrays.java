package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Sum_of_arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] nums = runningsum(arr);
        System.out.println(Arrays.toString(nums));
    }
   static int[] runningsum(int[] nums){
       int[] ans=new int[nums.length];
       ans[0] =nums[0];
       for(int i=0;i<nums.length;i++)
           ans[i]=ans[i-1]+nums[i];
       return ans;
   }
    }

