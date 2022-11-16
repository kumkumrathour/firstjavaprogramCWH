package com.TCS;
import java.util.Arrays;
import java.util.Scanner;
public class practice_tcs {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();}
            int max = arr[0];
            for (int j=0;j<n;j++){
                if(arr[j]>max){
                    max= arr[j];
                }
            }
            int min= arr[0];
            for(int i =0; i<n; i++){
                if (arr[1]<min){
                    min= arr[1];
                }
            }
        int res = (max-k)-(min+k);
 System.out.println(res);
    }
}
