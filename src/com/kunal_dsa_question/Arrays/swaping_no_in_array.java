package com.kunal_dsa_question.Arrays;

import java.util.Arrays;

public class swaping_no_in_array {
    public static void main(String[] args) {
        int [] arr={3,4,5,7,8,9};
        swap(arr,5,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
