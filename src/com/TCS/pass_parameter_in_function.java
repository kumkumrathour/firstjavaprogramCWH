package com.TCS;
import java.util.Scanner;
public class pass_parameter_in_function {
    public static void main(String[] args) {
        System.out.println( " enter the two numbers");
        int ans = sum(54,99);
        System.out.println( " the sum of two number is "+ ans);
    }
   static int sum(int a, int b) {
      Scanner sc= new Scanner(System.in);
      int sum1=0;
       a = sc.nextInt();
      b = sc.nextInt();
      sum1= a+b;
      return sum1;
   }
}
