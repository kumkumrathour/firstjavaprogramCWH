package com.kunal_dsa_question.function;
import java.util.Scanner;
public class sum_of_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        int ans  = issum(n);
        System.out.println("the sum is "+ ans);
    }
    static int issum(int a){
        int sum =0;
        for(int i= 0;i<=a;i++) {
            sum = sum + i;
        }
        return sum;
    }
}
