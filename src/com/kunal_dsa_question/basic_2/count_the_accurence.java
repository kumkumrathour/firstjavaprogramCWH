package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
public class count_the_accurence {
    public static void main(String[] args) {
        int n = 437822227;
        int count =0;
        while(n>0){
            int rem =n%10;
            if(rem==2){
                count++;
            }
            n=n/10;
        }
        System.out.println("the occurence is " + count);
    }
}
