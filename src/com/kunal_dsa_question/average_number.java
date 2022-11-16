package com.kunal_dsa_question;
import java.util.Scanner;
public class average_number {
    public static void main(String[] args){
        int a,b,c,d,e ;
        System.out.println("enter the values");{
            Scanner num=new Scanner(System.in);
            a = num.nextInt();
            b =num.nextInt();
            c =num.nextInt();
            d =num.nextInt();
            e=num.nextInt();
            int sum= a+b+c+d+e;
            System.out.println("total  marks"+ sum );
            double avg=sum/5;
            System.out.println("the average numbers on all subject is" + avg);

        }
}}
