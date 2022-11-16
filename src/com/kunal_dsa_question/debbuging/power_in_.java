package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class power_in_ {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        int power = 0;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the power ");
        int p= sc.nextInt();
        power=(int)Math.pow(n,p);
        System.out.println(" the final value is " + power );
    }
}
