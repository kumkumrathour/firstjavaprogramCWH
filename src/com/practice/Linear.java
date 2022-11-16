package com.practice;

public class Linear {
    public static void main(String[] args) {
        int [] nums = {1,2,4,5};
        int target = 4;
        linearsearch(nums, target);
    }

    static void linearsearch(int[] nums, int target){
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                System.out.println("the index value of target is "+ i);
               }
               else{
                System.out.println("target is not present in array");
               }
        }
       
    } 
}
