package com.TCS;
import java.util.Scanner;
public class input_sum_of_number {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println( " the sum of two number is " +ans);

    }
   // THE problem in the old solution is that if we have two sum of two number 100 times that the same code we cont want to write it 100 time so
    // IN such situation we have to use method in java because method can be use multiple time
    // this is the method to use "method" in java
     static int sum(){
        int sum =0;
        System.out.println( "  enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum=a+b;
        return sum;
    }
}
