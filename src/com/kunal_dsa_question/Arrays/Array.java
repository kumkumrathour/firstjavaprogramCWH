package com.kunal_dsa_question.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
//
        // datatype[] variable_name = new datatype[size];
        // eg - int [] roll = {3,4,6,8,96,11,5};
        // int[] roll; ---> declarations on an array ,roll is getting definite in the stack
        // roll =new int[5];---> initiLIStion CTUALLY HERE OBJECT IS BEING CRETED IN THE MERRORY[heap]
//        int[] arr = new int[5];
//        int a= 3;
//        int b=5;
//        int c=3;
//        int d =9;
//        int e = 7;
        //arrays of primitive
//        arr[0] = 4;
//        arr[1] = 6;
//        arr[2] = 7;
//        arr[3] = 9;
//        System.out.println(arr[3]);
//        //input using loop
//        for(int i =0;i<5;i++){       // if you now the side if the array

//        }
//       for(int i =0;i<arr.length;i++){      //if you dont know the side of the array
//         arr[i]=in.nextInt();
//           System.out.print(arr[i]+" ");
//       }
//        for(int num:arr){                //for every element in arrays ,print the element
//            System.out.print(num+" ");      // here num represent element of the array
//        }
        //System.out.println(arr[6]);             // it will give you an error ===>indexoutofbound;
       // System.out.println(Arrays.toString(arr));
        // arrays of objects
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for(int i =0; i< str.length; i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
         str[1] ="kumkum";
        System.out.println(Arrays.toString(str));
    }
}
