package com.kunal_dsa_question.Arrays;

import java.util.Arrays;

public class reverse_an_array {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,7);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
        static void swap(int[]arr, int index1, int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
    }

