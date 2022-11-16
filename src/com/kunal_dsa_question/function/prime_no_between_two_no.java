package com.kunal_dsa_question.function;
import java.util.Scanner;
public class prime_no_between_two_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printAllPrimeNms(a,b);

    }
    static boolean isPrimeNumber(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void printAllPrimeNms(int a,int b){
        for(int i=a; i<=b;i++){
//            System.out.print(i);

        if(isPrimeNumber(i)){
            System.out.println(i);
        }
            }
        }
    }

