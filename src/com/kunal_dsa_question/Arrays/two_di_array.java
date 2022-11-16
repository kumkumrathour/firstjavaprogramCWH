package com.kunal_dsa_question.Arrays;
import java.util.Scanner;
public class two_di_array {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        Scanner in = new Scanner(System.in);

//        System.out.println(arr.length);
//        System.out.println("enter the elemrnt ");

        for(int row =0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col]=in.nextInt();
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


    }
}
