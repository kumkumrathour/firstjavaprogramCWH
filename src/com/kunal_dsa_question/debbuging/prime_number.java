package com.kunal_dsa_question.debbuging;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n =sc.nextInt();
        boolean prime = true;
        for (int i = 2 ; i < n; i++) {
            if (n % i == 0) {
                prime=false;
                break;
            }
                System.out.println(prime);

        }
    }
}

