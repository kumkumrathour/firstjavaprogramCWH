package com.kunal_dsa_question.basic_2;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        System.out.println(" enter the value of the string ");
        Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int p;
       if(n>m){
           p=n+m;
           System.out.println(" the sum is " + p);
       }
       if(n<m){
           p=n-m;
           System.out.println("the substraction value is "+ p);
       }
       if(n>=m){
           p= n/m;
           System.out.println("the divded value is "+ p);
       }
       if(n<=m){
           p=n*m;
           System.out.println(" the value of multiplication is " + p);
       }
    }
}
