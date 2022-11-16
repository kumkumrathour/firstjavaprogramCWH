package com.kunal_dsa_question;
import java.util.Scanner;
public class leap_year {
    public static void main(String [] args){
        int y;
        Scanner sc=new Scanner(System.in);
        y= sc.nextInt();
        if( y%100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("this is a leep year");
        }
        else{
            System.out.println("this is not a leep year");
        }
    }
}
