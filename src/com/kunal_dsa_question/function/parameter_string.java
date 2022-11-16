package com.kunal_dsa_question.function;
import java.util.Scanner;
public class parameter_string {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter your name ");
        String name= in.next();
      String st=myGreat(name);
        System.out.println(st);
    }
    static String myGreat(String name){
        String msg=" hello " + name;
        return msg;
    }
}
