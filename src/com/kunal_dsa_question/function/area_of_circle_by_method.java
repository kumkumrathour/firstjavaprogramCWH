package com.kunal_dsa_question.function;
import java.util.Scanner;
public class area_of_circle_by_method {
   public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
       System.out.println("enter the radii of the circle");
        int r = sc.nextInt();
       double ans = circle(r);
        System.out.println("the area of circle is " + ans);
    }
   static double circle(int r){
       double area = 3.14*r*r;
        int y =(int)area;
        return area;
//        double circumference = 2*3.14*r;
//        int x=(int)circumference;
//        return circumference;
    }
}
