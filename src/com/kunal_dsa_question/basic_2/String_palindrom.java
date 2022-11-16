package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
public class String_palindrom {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String rev ="";
        for(int i = s.length()-1 ; i>=0 ; i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("the value of reversing an array "+ rev);
        if(s.equals(rev)){
            System.out.println("the string is a palindrom ");
        }
        else{
                    System.out.println("it is not a palindrom ");
                }
            }
        }


