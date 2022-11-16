package com.kunal_dsa_question.function;
import java.util.Scanner;
public class block_scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 43;
        {
             a = 32;
             int c = 56;                                                // value initiallize in the block remain in the block and the value which are not intiallise inside the block we can not use then inside the block
            System.out.println(c);                                     //but if the value is initiallise outside the block are remain outside the block in the same method
             //    int a = 43;                                                      // but we can chang ethe value of it
           a=32;                                                       // reassign the original ref variable to some other value
        }
        for (int i = 0; i<4; i++){
            System.out.println(i);
            int num = 90;
          //  int a = 10;

        }
       // System.out.println(i);          i is not comeout of this block
    }
  static void random(int marks)  {
        int num =54;
      System.out.println(num);
      System.out.println(marks);
  }
}
