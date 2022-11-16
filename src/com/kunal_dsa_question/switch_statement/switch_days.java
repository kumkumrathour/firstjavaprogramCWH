package com.kunal_dsa_question.switch_statement;
import java.util.Scanner;
@SuppressWarnings("ALL")
public class switch_days {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
        int day;
        day = in.nextInt();
        if (1 == day) System.out.println("monday");
        else if (day == 2) {
            System.out.println("tuesday");
        } else if (day == 3) {
            System.out.println("wednesday");
        } else if (day == 4) {
            System.out.println("thursday");
        } else if (day == 5) {
            System.out.println("friday");
        } else if (day == 6) {
            System.out.println("saturday");
        } else if (day == 7) {
            System.out.println("sunday");
        } else {
            System.out.println("enter the currect number");
        }
}}
