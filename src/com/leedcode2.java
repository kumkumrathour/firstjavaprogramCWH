package com;
import java.util.Scanner;

        public class leedcode2 {
            public static void main(String[] args) {
            /*  int[][] num = new int[3][4];
                Scanner obj = new Scanner(System.in);
                System.out.println(" enter the value ");
                for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 4; j++) {
                    num[i][j] = obj.nextInt();
                }}
                System.out.println(" matrix form ");
                for  ( int i = 0; i <3; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print( num [i][j] + " ");
                    }
                    System.out.println();
                }*/

           Scanner c = new Scanner(System.in);
             // int num []= {11, 32, 22, 43,87, };
                System.out.println( " enter the size of an array");
            int a =c.nextInt ();
                int[] arr = new int [ a ];
                System.out.println( " enter the item in array ");
                for ( int i=0; i<arr.length; i++)
            {
                arr [i]=c.nextInt();
        }
                System.out.println( " array item is");
                for ( int i=0;i< arr.length; i++)
            {
                System.out.print(arr [i]);
                System.out.print( "\t");
            }
 }}
