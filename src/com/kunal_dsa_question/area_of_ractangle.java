package com.kunal_dsa_question;
import java.util.Scanner;
public class area_of_ractangle {
    public static void main(String[] args){
        int l,b;double area;
        System.out.println("enter the length and breath of rectangle");
        Scanner in = new Scanner(System.in);
        l=in.nextInt();
        b=in.nextInt();
        area=l*b;
        System.out.println("area of rectangle"+ area);
    }
}
