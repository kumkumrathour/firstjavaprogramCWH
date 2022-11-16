package com.kunal_dsa_question.function;
import java.util.Scanner;
public class function_sum_of_two_numbers {
public static void main(String[] args){
    sum();
    sum();
    sum();
}
static void sum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();
    int sum = num1+num2;
    System.out.println("the sum of two number is "+sum);

}
}
