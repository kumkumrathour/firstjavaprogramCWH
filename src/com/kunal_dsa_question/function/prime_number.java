package com.kunal_dsa_question.function;
import javax.swing.*;
import java.util.Scanner;
public class prime_number {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println(" enter the number  ");
            int n = sc.nextInt();
            boolean ans = prime(n);
            System.out.println(" the number is a prime number  ? " + ans);
        }
        static boolean prime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return true;
                }
                else{
                    return false;
                }
            }
                return true;
        }
    }
