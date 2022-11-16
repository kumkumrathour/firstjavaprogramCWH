package com.kunal_dsa_question.Arrays.practice_array;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
public class how_many_number_are_small_then_current {
    public static void main(String[] args) {
        class Solution {
            public int[] smallerNumbersThanCurrent(int[] nums) {
                int[] ans = new int[nums.length];
                for(int i = 0; i<nums.length ; i++){
                    int temp =0 ;
                    for(int j=0 ; j<nums.length ; j++){
                        if(nums[j]<nums[i] && i!= j)
                            temp++;
                        ans[i]=temp;
                    }
                }
                return ans;
            }
        }
    }
}
