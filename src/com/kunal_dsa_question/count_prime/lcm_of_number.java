package com.kunal_dsa_question.count_prime;
import java.util.Scanner;
public class lcm_of_number {
    public static void main(String[] args){
        int h=1,l,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
                h=i;}
        l=(a*b)/h;
            System.out.println("the lcm of two numbers is "+l);


    }
}
