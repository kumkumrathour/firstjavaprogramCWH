package com.kunal_dsa_question.function;
import java.util.Scanner;
public class pythagoren_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.  ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o =sc.nextInt();
        boolean ans = pytha(n,m,o);
        System.out.println("the pytha no is yes or no ." + ans);
    }
    static boolean pytha(int a , int b, int c){
        if(a*a+b*b==c*c){
            return true;
        }
        return false;
    }
}
