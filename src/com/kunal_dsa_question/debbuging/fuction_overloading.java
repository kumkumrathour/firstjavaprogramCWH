package com.kunal_dsa_question.debbuging;

public class fuction_overloading {
    public static void main(String[] args) {
        sum(6,9);
        sum("kumkum");
    }
    static void sum(int a){
        System.out.println(a);
    }
     static void sum(int a,int b){
         System.out.println(a+" "+b);
     }
     static void sum (String name){
         System.out.println(name);
     }
}
