package com.kunal_dsa_question.Arrays;
public class largest_no_in_array {
    public static void main(String[] args) {
        int[]arr={4,53,44,98,67,86,45,34,100};
        System.out.println("the max is "+max(arr));
    }
    static int max(int[]arr){
        int ismax=arr[0];
        for(int i =0; i<arr.length;i++){
            if(ismax<arr[i]){
                ismax=arr[i];
            }
        }
        return ismax;
    }
}
