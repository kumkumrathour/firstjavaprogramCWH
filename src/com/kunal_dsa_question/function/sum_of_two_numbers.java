package com.kunal_dsa_question.function;
import java.util.Scanner;
public class sum_of_two_numbers {
    public  static void  main(String[] args) {
        System.out.println(" enter the numbers");
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int ans = sum(a,b);
        System.out.println("the sum of wo numbers is "+ ans);
    }
    static int sum(int a , int b) {
     int sum = a+b;
       return sum;
    }
}
