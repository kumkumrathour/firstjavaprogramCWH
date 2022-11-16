package com.kunal_dsa_question.count_prime;
import java.util.Scanner;
public class sum_of_two_numbers {
    public static void main(String[] args) {
        int a,b;
        int sum;
        System.out.println("enter the values");
        {
            Scanner num = new Scanner(System.in);
            a = num.nextInt();
            b= num.nextInt();
            sum=a+b;
            System.out.println("the sum of two given numbers are " +sum);

        }
    }
}
