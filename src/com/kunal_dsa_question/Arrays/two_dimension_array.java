package com.kunal_dsa_question.Arrays;
import java.util.Scanner;
public class two_dimension_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr= new int[3][3];
        System.out.println("the length of the array is " + arr.length);
        System.out.println("enter the element of an array ");
        for(int row=0; row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
