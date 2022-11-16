package com.kunal_dsa_question;
import java.util.Scanner;
public class hcf_of_number {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
       System.out.println("enter the two number");
         int a= sc.nextInt();
         int b = sc.nextInt();
            int h=1;
for(int i=1;i<=a;i++){
    if(a%i==0 && b%i==0)
        h=i;
}
        System.out.println(" the hcf of two number is "+h);
    }}