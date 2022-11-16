package com.kunal_dsa_question.basic_2;
import  java.util.Scanner;
public class largest_no {
    public static void main(String[] args) {
        System.out.println(" entyer the no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m) {
            System.out.println(" the greatest no. is" + n);
        } else {
            System.out.println(" the greatest number is " + m);
        }
    }
}
