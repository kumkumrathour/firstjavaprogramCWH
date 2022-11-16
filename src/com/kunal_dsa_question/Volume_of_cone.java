package com.kunal_dsa_question;
import java.util.Scanner;
public class Volume_of_cone {
    public static void main(String[] args){
        final double PI=3.14,volume;
        int r,h;
        System.out.println("enter the value and height of cone");
        Scanner ref = new Scanner(System.in);
        r = ref.nextInt();
        h =ref.nextInt();
        volume=(3.14*h*r*r)/3;
        System.out.println("the volume of cone is "+ volume);


    }
}
