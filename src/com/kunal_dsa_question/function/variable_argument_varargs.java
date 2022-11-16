package com.kunal_dsa_question.function;
import java.util.Arrays;
import java.util.Scanner;
public class variable_argument_varargs {
    public static void main(String[] args) {
      fun(3,45,6,43,7,88,43,22,765,678,42,231,11);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
