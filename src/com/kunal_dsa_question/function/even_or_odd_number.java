package com.kunal_dsa_question.function;
import java.util.Scanner;
public class even_or_odd_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("the number ios even ");
        }
        else{
            System.out.println(" the number is odd");
        }
    }
}
