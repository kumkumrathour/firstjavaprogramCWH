package com.kunal_dsa_question;
import java.util.Scanner;
public class area_of_circle
{
    public static void main(String[] args){
         final double PI=3.14,area;
         int r;
         System.out.println(" enter radios of circle");
         Scanner ref = new Scanner(System.in);
         r = ref.nextInt();
         area = PI*r*r;
         System.out.println(area);
         System.out.println(" area of circle is" );
    }
}
