package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class two_D_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  int[][] arr = new int[3][];
//        int[][]  arr2d={
//                {3,5,7},//0th index
//                {12,43}, //1st index
//                {55,65,90} //2nd index
//        };
       // System.out.println(Arrays.toString(arr2d));

        // INPUT OF TWO D ARRAY ( HOW TO TAKE INPUT FROM THE USER FOR 2DIMENSION IN ARRAY MEANS WHICH CONTAIN ROW AND COLOUM)
       // input
        int[][] arr=new int[4][4];
        System.out.println(arr.length);
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
              arr[row][col]=in.nextInt();
               // System.out.print(arr[row][col]);
            }
        }
        //output ==1
//        for(int row=0; row<arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        // THIS WHOLE ABOVE OUTPUT WE CAN EASILY BE REPLACE BY SINGLE LINE LIKE THIS
        // OUTPUT(this output we have to use in our answer)
        // output ==2
//        for(int row=0; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //enhance way of writing output of an array is as follow
        //output ==3
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
