package com.practice;
//https://leetcode.com/problems/two-sum/submissions/
public class sum_two_leedcode {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int sum = 0;
            int[] ans = {-1,-1};
            for( int i = 0; i<nums.length; i++){
                for( int j = i+1 ; j<nums.length ; j++){
                    if(target == nums[i]+ nums[j])
                    {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
            return ans;
        }
    }
}
