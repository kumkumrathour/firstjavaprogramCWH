package com.kunal_dsa_question;
import java.util.Scanner;
public class factorial_in_java {
    public static void main(String[] args){
        System.out.println("enter the values");
        Scanner s=new Scanner(System.in);
            int no = s.nextInt();
            int  fact = 1;
            for(int i=1; i<=no; i++){
                 fact=fact*i;
                System.out.println("factorial of given number is "+fact);
            }

                    }
            }

