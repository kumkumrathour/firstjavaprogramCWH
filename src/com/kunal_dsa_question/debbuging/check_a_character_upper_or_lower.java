package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class check_a_character_upper_or_lower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c= sc.next().trim().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println("the charachter is in lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }
}
