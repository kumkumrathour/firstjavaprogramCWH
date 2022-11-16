package com.company;
import java.util.Scanner;
public class Distance_between_two_points {
    public static void main(String [] args){
        long x1,x2,y1,y2;
        double dis;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value x1");
        x1= sc.nextInt();
        System.out.println("enter the value of x2");
        x2= sc.nextInt();
        System.out.println("enter the value of y1");
        y1=sc.nextInt();
        System.out.println("enter the value of y2");
        y2=sc.nextInt();
        dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between two points is"+dis);
    }
}
