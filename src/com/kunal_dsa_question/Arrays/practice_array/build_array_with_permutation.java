package com.kunal_dsa_question.Arrays.practice_array;
//https://leetcode.com/problems/build-array-from-permutation/submissions/
public class build_array_with_permutation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int n=nums.length;
            int[] ans =new int[n];
            for(int i =0;i<nums.length;i++){
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }
}
