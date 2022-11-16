package com.kunal_dsa_question.Arrays.practice_array;
//https://leetcode.com/problems/concatenation-of-array/
public class concatenation_of_array {
    public static void main(String[] args) {
        class Solution {
            public int[] getConcatenation(int[] nums) {
                int n = nums.length;
                int[] ans = new int[2*n];
                for(int i = 0 ; i<n ; i++){
                    ans[i]=nums[i];
                    ans[i+n] = nums[i];
                }
                return ans;
            }
        }
    }
}
