package com.kunal_dsa_question.function;
import java.util.Scanner;
public class palindrom_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(num(n));
    }
    static boolean  num( int n){
        int rem,rev=0;
        int temp =n;
        while ( temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (n==rev){
            System.out.println(n+"is a palindrom number");
            return true;
        }
        else{
            System.out.println(n+"the number is not a palindrom number ");
            return false;
        }

    }
}
