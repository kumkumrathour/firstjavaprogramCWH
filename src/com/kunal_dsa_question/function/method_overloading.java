package com.kunal_dsa_question.function;
import java.util.Arrays;
public class method_overloading {
    public static void main(String[] args) {
     fun(65);
     fun("kumkum");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
