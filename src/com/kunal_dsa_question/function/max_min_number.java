package com.kunal_dsa_question.function;
import  java.util.Scanner;
public class max_min_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  first numbers");
        int a =sc.nextInt();
        System.out.println("enter the second number");
        int b =sc.nextInt();
         System.out.println("enter the third number");
        int c=sc.nextInt();
        int largest;
        if(a>b && a>c){
           largest = a;
            System.out.println("a is the largest number"+a);
        }
        else if(b>a && b>c){
            System.out.println("b is the largest number"+b);
        }
        else{
            System.out.println("c is the largest number"+c);
        }


    }
}
