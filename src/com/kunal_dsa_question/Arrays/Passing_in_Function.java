package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
public class Passing_in_Function {
    public static void main(String[] args) {
        int[]nums={65,7,44,98,32,44};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
       arr[1]=100;
    }}
//}
