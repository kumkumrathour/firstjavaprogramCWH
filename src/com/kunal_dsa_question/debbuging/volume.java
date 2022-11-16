package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class volume {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double r = sc.nextInt();
       double ans = volume1(r);
        System.out.println(" the volume of sphere is " + ans);
    }
    static double volume1 (double r){
        double pi = 3.14;
        double  v = 3*(pi*r*r*r)/4;
        return v;
    }
}
