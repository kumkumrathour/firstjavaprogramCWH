package com.kunal_dsa_question.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class multi_dimension_array_list {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        //initilisation of an element
        for(int i = 0; i<3; i++){
            list.add(new ArrayList<>());
        }
        // add element
        for(int i =0;i<3;i++){
            for(int j = 0; j<3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
