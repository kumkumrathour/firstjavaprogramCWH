package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class factorial_real {
    public static void main(String[] args) {
        int fac =1;
        System.out.println("enter the value ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            fac=fac*i;
            System.out.println("the factorail of a number is " + fac);
        }
    }
}
