package com.kunal_dsa_question.function;
import java.util.Scanner;
public class factorial_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n =sc.nextInt();
        int ans = factorial (n);
        System.out.println("the factorial of a giver numbers is "+ ans);
    }
    static int factorial( int n){
         int fact =1;
         if(n==0 || n==1)
        for(int i = 1; i<= n; i++){
         fact = fact *i;
            System.out.println(fact);
        }
        return fact;
    }
}
