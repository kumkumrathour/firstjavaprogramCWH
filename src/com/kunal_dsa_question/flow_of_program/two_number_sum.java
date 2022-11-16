package com.kunal_dsa_question.flow_of_program;
import java.util.Scanner;
public class two_number_sum {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int a = n.nextInt();
        int b= n.nextInt();
        for(int i=1 ; i <= b  ; i++) {
            a++;
        }
            int sum = a;
            System.out.print(sum);
    }
}
