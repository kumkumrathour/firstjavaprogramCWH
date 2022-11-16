package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,9,22};
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index3, int index5){
        int temp=arr[index3];
        arr[index3] = arr[index5];
        arr[index5]=temp;
    }
}
