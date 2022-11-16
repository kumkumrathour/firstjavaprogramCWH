package com.kunal_dsa_question;
import java.util.Scanner;
public class sum_of_a_digit_of_a_number {
    public static void main(String[] args){
        int num,rem,sum=0;
        System.out.println(" enter the number");
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("the sum of the digit of a number is"+ sum);
    }
}
