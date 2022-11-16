package com.kunal_dsa_question.flow_of_program;
//import java.io.*;
//import java.math.*;
import java.util.Scanner;
public class Sum_of_all_input_no {
    public static void main(String[] args) {
        int num;
        int i =1 ;
        int total =0;
        System.out.println("press an letter X to quit or " );
        System.out.println("enter no."+i+"=");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            num = scan.nextInt();
            total +=num;
            i++;
            System.out.println("enter another number or X to quit "+ i + "=");
      }
        System.out.println(" the total sum is "+ total);
    }

}
