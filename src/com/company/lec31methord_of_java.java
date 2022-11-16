package com.company;

import org.w3c.dom.ls.LSOutput;

public class lec31methord_of_java {
//    every function must have a return type
    static int logic(int x, int y) {
     int z;
     if (x>y){
     z=x+y;
     }
     else{
         z =(int)(x+y)*5;
     }
     return z;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        int c;
        c = logic( a, b );
        //or
        int A=6;
       int B=9;
        int C;
        if (A>B){
            C=A+B;
        }
        else{
           C=(A+B)*5;
        }
        int o =14;
        int p = 6;
        int q;
        if (o > p) {
            q = o + p;
        }
        else {
           q = (o + p) * 5;
    }
    System.out.println(c);
    System.out.println(q);
    System.out.println(C);
    }
}
