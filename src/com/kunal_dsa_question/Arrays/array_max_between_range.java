package com.kunal_dsa_question.Arrays;

public class array_max_between_range {
    public static void main(String[] args) {
        int[] arr = {32,43,532,65,34,56,78,45,99,103};
        System.out.println(maxrange(arr,2,7));
    }
    static int maxrange(int[]arr, int start,int end){
      int max =arr[start];
      for(int i=0;i<end;i++){
          if(max<arr[i]){
              max=arr[i];
          }
      }
      return max;
    }
}
