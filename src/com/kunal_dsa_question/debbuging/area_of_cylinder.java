package com.kunal_dsa_question.debbuging;
import java.util.Scanner;
public class area_of_cylinder {
    public static void main(String[] args) {
        System.out.println(" enter the radii of cylinder");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        double ans = cylinder(n,h);
        System.out.println("the are of a cylinfer is " + ans);
    }
        static double cylinder(int n , int h){
            double area = 3.14*n*n*h;
            int y = (int)area;
            return area;

    }
}
