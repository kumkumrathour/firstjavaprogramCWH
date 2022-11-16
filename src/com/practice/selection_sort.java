package com.practice;
//https://leetcode.com/problems/sort-an-array/
public class selection_sort {
    class Solution {
        public int[] sortArray(int[] nums) {
            int min;
            int temp=0;
            for(int i = 0; i<nums.length; i++)
            {
                min=i;
                for(int j= i+1; j<nums.length; j++){
                    if(nums[j]<nums[min]){
                        min=j;
                    }

                }
                // System.out.print(i);
                // System.out.print(min);
                // System.out.print('\n');
                temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;

                // for (int k =0;k<nums.length;k++){
                //     System.out.print(nums[k]);
                // }
                // System.out.print("\n");

            }
            return nums;
        }
    }

}
