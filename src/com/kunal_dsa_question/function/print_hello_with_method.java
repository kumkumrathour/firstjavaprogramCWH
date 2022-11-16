package com.kunal_dsa_question.function;

import java.util.Scanner;

public class print_hello_with_method {
    public static void main(String[] args){
       // print_hello_with_method();
        int ans=sum();
        System.out.println(ans);

    }
    static int sum(){
       // System.out.println(" hello world");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
       // System.out.println("the sum of two number is "+sum);
        return  sum;
    }
    static  void sum2(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();
    int sum = num1+num2;
    System.out.println("the sum of two number is "+sum);
}
}

