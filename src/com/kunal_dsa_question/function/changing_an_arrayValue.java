package com.kunal_dsa_question.function;
import java.util.Arrays;
import java.util.Scanner;
public class changing_an_arrayValue {
    public static void main(String[] args) {
        //creating an arrey;
        int[] arr = {1,4,6,8,10,45,87};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[5]=210;
    }
}
