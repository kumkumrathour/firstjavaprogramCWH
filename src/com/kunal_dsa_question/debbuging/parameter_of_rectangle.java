package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class parameter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextInt();
        double b = sc.nextInt();
        double ans = parameter(l,b);
        System.out.println("the parameter of rectangle is " + ans);
    }
    static double parameter(double l, double b){
        double parameter1 = 2*(l+b);
       // int y =(int)parameter;
        return parameter1 ;
    }
}
