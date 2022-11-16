package com.kunal_dsa_question.function;
import java.util.Scanner;
public class greater_then_a_certain_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int n = sc.nextInt();
        if(n>=18){
            System.out.println("he or she is eligible to vote");
        }
        else{
            System.out.println("he or she is not eligible to vote");
        }

    }
}
