package com.kunal_dsa_question;
import java.util.Scanner;
public class volume_of_sphere {
    public static void main(String[] args){
         final double PI=3.14, volume;
         int r;
         System.out.println(" enter the radii of sphere ");
         Scanner in = new Scanner(System.in);
         r = in.nextInt();
         volume=(4*PI*r*r*r)/3;
         System.out.println("the volume of sphere is " + volume);

    }
}
