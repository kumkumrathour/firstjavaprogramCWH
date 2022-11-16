package com.kunal_dsa_question.function;
import java.util.Scanner;
public class funcation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("the sum of two number is "+sum);

    }
}
//this is the wrong way to do a question because if we want to do a sum of two number thuosand time then how can we do it can
//can not write this code 100 time and repeat outself 100 time because it take time and money so we have use this to come out of this problem
//we use method and classes