package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
public class find_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p =sc.nextInt();
        int t =sc.nextInt();
        int r = sc.nextInt();
        int simple =0;
        simple=(p*r*t)/100;
        System.out.println(" the simple interest is "+ simple);
    }
}
