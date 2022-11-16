package com.kunal_dsa_question;
import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args){
        int n,sum=0;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum)
            System.out.println("this number is a perfect number");
        else
            System.out.println("not a perfect number");
    }
}
