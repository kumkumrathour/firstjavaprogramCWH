package com.kunal_dsa_question.debbuging.prime_no;
import java.util.Scanner;
public class find_prime_number_between_number {
    public static void main(String[] args) {
        System.out.println("enter no. ");
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j =2 ; j<i-1 ;j++){
                if(i%j==0){
                    temp=temp+1;
                    System.out.println(temp);
                }
            }
            if(temp==0){
                System.out.println(i);
            }
            else{
                temp=0;
            }
        }
    }
}
