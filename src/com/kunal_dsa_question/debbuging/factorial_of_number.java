package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int ans = fact(n);
        System.out.println("the factorial of a given number is " + ans);
    }
    static int fact(int n){
        int f =1;
        for(int i =1 ; i<=n ; i++){
            if(n%i==0){
//                factor of a number
             System.out.println(" the factor value is " +i);
            }
        }
        return f;
    }
}
