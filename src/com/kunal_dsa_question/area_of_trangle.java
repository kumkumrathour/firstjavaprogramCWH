package com.kunal_dsa_question;
import java.util.Scanner;
public class area_of_trangle {
    public static void main(String[] args){
        int a,b,c,sp;double area;
        System.out.println(" enter the value of the side of trangle");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("area of trangle"+area);
    }
}
