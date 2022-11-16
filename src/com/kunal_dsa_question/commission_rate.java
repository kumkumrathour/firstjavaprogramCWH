package com.kunal_dsa_question;
import java.util.Scanner;
public class commission_rate {
    public static void main(String[] args){
        double comm=0.0;
        int rate=0,sale;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sales rs:");
        sale= sc.nextInt();
        if(sale<=20000){
            rate=3;
            comm=sale*0.03;
        }
        if(sale>=20000 && sale<=50000){
            rate=12;
            comm=sale*0.12;
        }
        if(sale>=50000){
            rate=30;
            comm=sale*0.3;
        }
        System.out.println(" commission amount"+comm);
        System.out.println("commission rate"+rate);
    }
}
