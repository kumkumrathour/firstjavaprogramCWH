package com.kunal_dsa_question;

public class reverse_a_number {
    public static void main(String [] args){
        int no=56578;
        int reverse=0,remainder;
        while(no!=0){
            remainder=no%10;
            reverse=reverse*10+remainder;
            no=no/10;
        }
        System.out.println(reverse);
    }
}
