package com.practice;
//https://leetcode.com/problems/sort-an-array/submissions/
public class question_912_leedcode_insertion_sort {
    class Solution {
        public int[] sortArray(int[] nums) {
            for(int i= 1; i<nums.length; i++){
                int temp=nums[i];
                int j=i-1;
                while(j>=0 && nums[j]>temp)
                {
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1]=temp;
            }
            return nums;
        }

    }
}
