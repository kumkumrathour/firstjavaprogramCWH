package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
//import java.util.Scanner;
public class array_of_permutation {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        int[] arr={0,2,1,5,3,4};
        int[] nums = permutation(arr);
        System.out.println(Arrays.toString(nums));
    }
    static int[] permutation(int[] nums) {
           int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=  nums[nums[i]];
    }
        return ans;
    }
}
