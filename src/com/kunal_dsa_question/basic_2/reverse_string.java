package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev ="";
        for(int i =s.length()-1;i>=0;i-- ){
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse string  is "+ rev);
    }
}
