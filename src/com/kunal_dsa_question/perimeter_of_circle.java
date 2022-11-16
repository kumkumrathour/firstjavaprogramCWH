package com.kunal_dsa_question;
import java.util.Scanner;
public class perimeter_of_circle {
    public static void main(String[] args){
        final double PI=3.14,perimeter;
        int r;
        System.out.println(" write the value of radii");
        Scanner in=new Scanner(System.in);
        r= in.nextInt();
        perimeter = 2*3.14*r;
        System.out.println("the perimeter of circle is "+ perimeter);
    }
}
