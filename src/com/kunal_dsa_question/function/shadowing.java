package com.kunal_dsa_question.function;
import java.util.Scanner;
public class shadowing {
     static  int x =49;
    public static void main(String[] args) {
      //  System.out.println(x);
        int x =56;
        //System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
