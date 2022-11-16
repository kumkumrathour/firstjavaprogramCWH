package com.kunal_dsa_question.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Col_No_Fixed_Size {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //syntax
       ArrayList<Integer> list= new ArrayList<Integer>();
//        list.add(32);
//        list.add(1322);
//        list.add(3324);
//        list.add(2154);
//        list.add(256);
//        System.out.println(list.contains(25));
//        System.out.println(list);
        // to remove any element in an array
      //  list.remove(3);
      //  to change the element of an arrays
      //  list.set(1,22);
        //System.out.println(list);


        //input -->
        for(int i=0;i<5;i++){
       list.add(in.nextInt());
    }
        //print
        System.out.println(list);
        //if we want to take out some specific item of an array (some specific index value) we can not do like arr[2]{no not like this}use{list.get(i)}
        for(int i=0;i<5;i++){
            System.out.print(list.get(3));
        }
        System.out.println(list);
    }
}
