package com.kunal_dsa_question.flow_of_program;
import java.util.Scanner;
public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter two number");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ON=N;
        int OM=M;
        while(N%M!=0){
            int rem = N%M;
            N=M;
            M=rem;
        }
       int HCF =M;
        int LCM = (ON*OM)/HCF;
        System.out.println("the hcf of a number is "+ HCF);
        System.out.println(" the lcm of a number is "+ LCM);
    }
}

// do this question with different method

