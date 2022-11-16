package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
public class Fabonacci_series {
    public static void main(String[] args) {
        System.out.println("enter the no. ");
       Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
 for(int i = 1 ;i<=10; i++){
            c=a+b;
            System.out.println(a+"+"+b+"="+c);
            a=b;
            b=c;
        }
        System.out.println("the final value is " + b);
    }

    }


