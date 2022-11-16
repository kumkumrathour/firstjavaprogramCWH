package com.kunal_dsa_question.debbuging;
import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
import java.util.Scanner;
public class till_enter_zero {
    public static void main(String[] args) {
        Integer neg = Integer.MIN_VALUE;
        System.out.println("enter a series of value (0 to quit): ");
        Scanner sc = new Scanner(System.in);
        int input =0;
        while((input=sc.nextInt())!=0)
        {
            neg= Math.max(input,neg);
        }
        System.out.println(" your max no. is "+ neg);
    }
}
