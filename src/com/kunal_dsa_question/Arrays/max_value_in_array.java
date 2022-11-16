package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
public class max_value_in_array {
    public static void main(String[] args) {
        int[] arr={77,55,444,99,765,55};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal= arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
