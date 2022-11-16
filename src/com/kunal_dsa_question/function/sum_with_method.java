package com.kunal_dsa_question.function;
import java.util.Scanner;
public class sum_with_method {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(" enter the no");
       int n = sc.nextInt();
       int m =sc.nextInt();
        int ans = issum(n,m);
        System.out.println("the sum is" + ans);
    }
    static int issum(int a , int b){
        int sum = a+b;
        return sum;
    }
}
