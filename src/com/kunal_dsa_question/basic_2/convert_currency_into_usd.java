package com.kunal_dsa_question.basic_2;
import java.util.Scanner;
import java.util.*;
public class convert_currency_into_usd {
    public static void main(String[] args) {
        System.out.println(" enter the rupees ");
        Scanner sc= new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println("enter rupees "+n);
        float p = n*0.03f;
        System.out.println("the value of rupees in usd is "+ p);
    }
}
