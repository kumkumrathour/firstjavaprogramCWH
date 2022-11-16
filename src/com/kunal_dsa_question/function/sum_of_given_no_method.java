package com.kunal_dsa_question.function;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class sum_of_given_no_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        int ans = sumOfN(n);
        System.out.println("the sum of all numbers is: " + ans);
    }
    static int sumOfN(int n){
        int sum=0;
          for(int i =1; i<=n; i++){
              sum=sum+i;
          }
        return sum;
    }
}
