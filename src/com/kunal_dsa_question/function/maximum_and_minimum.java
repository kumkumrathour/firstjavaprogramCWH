package com.kunal_dsa_question.function;
import java.util.Scanner;
public class maximum_and_minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        if(n>m && n>p || n<m && n<p){
            System.out.println(n);
        }
        if (m>n && m>p || m<n && m<p){
            System.out.println(m);
        }
        else{
            System.out.println(p);
        }
    }
}
