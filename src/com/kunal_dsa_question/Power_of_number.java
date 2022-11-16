package com.kunal_dsa_question;
import java.util.Scanner;
public class Power_of_number {
    public static void main(String[] args){
        int n, p, result=1;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("enter the power");
        p=sc.nextInt();
        for(int i=1;i<=p; i++){
             result= n*result;
             System.out.println(" the power of a given number is "+ result);

        }
    }
}
