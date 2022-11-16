package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
public class find_even_and_odd {
    public static void main(String[] args) {
        System.out.println("enter no ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(" even");
        }
        else{
            System.out.println("odd");
        }
    }
}
