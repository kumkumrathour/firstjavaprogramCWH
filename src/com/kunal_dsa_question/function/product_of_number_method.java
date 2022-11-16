package com.kunal_dsa_question.function;
import java.util.Scanner;
public class product_of_number_method {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = product(a,b);
        System.out.println("the product of two number is "+ ans);
    }
    static int product( int a, int b){
        int product = a*b;
        return product;
    }
}
