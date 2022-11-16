package com.kunal_dsa_question;
import java.util.Scanner;
public class factor_of_numbers {
    public static void main(String[] args){
        int n;
        System.out.println(" enter the value");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println("the factor of this numbers are " + i);
            }

        }
    }
}
