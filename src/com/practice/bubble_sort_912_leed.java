package com.practice;
//https://leetcode.com/problems/sort-an-array/submissions/
public class bubble_sort_912_leed {
    class Solution {
        public int[] sortArray(int[] nums) {
            for(int i = 0; i<nums.length-1; i++)
            {
                for(int j =0;j<nums.length-1;j++){
                    if(nums[j]>nums[j+1]){
                        int temp =nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }

            } return nums;

        }

    }
}
