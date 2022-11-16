package com;
import java.util.Scanner;
public class TCS_practice_queation {
        public static void main(String[] args) {
            int i,j;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the row");
            int row = sc.nextInt();
            for(i=1;i<=row;i++) {
                for (j = i; j <= row; j++)
                    System.out.print("");
                for (j = 1; j <= i; j++) ;
                for (j = i - 1; j >= 1; j--)
                    for (j = i - 1; j >= 1; j--)
                        System.out.print(j + "");
                System.out.println();
            }
        }
}
