package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class array_method {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7,3,3,13,54,67};
        System.out.println("thr array is " + Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[2]=23;
    }
}
