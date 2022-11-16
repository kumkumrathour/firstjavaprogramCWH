package com.kunal_dsa_question.basic_2;

public class reverse_number_without_loop {
    public static void main(String[] args) {
        int n =47885;
        int ans=0;
        int rem =0;
        while(n>0){
            rem=n%10;
            n/=10;
             ans = ans*10+rem;
            System.out.println("reverse is "+ ans);
        }
    }
}
