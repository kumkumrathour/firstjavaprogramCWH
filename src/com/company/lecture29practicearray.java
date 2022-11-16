package com.company;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class lecture29practicearray {
    public static void main( String[] args){
    /*  question 1 Scanner sc= new Scanner(System.in);
        System.out.println("enter the value:");
        int num=sc.nextInt();
        int [] array =new int[num];
        num=0;
        for(int i=0;i<=num;i++);
        {
            System.out.println("enter the element");
            array [num]=sc.nextInt();
             num=num+
        }*/
        /*float[] marks={ 45.5f,23.4f,99.1f, 65.9f };
        float sum=0;
        for( float element:marks){
            sum=sum+element;
        }
        System.out.println(" sum of the element:"+sum);*/
      /* int[] students={ 32 ,12,43,23,33,76,56,};
       int sum=0;
       for( int i=0;i<students.length;i++){
         //  System.out.println(students[i]);
           sum=sum+students[i];}
           System.out.println(sum);*/
//question2
       /* int[] students={ 32 ,12,43,23,33,76,56,};
        int num = 23;
       for( int i=0;i<students.length;i++){
           if( num==students[i])
           {
               System.out.println(" the value is present in this array :");
           }
           else{
               System.out.println("the value is not present in this array:");
               break;
           }
       }*/
    /* float[] marks={ 32.5f,54.1f,65.87f,54.98f,33.54f};         //((dought))
      float num=54.1f;
      boolean isInArray=false;
      for( element:marks) {
            if (num==element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInarray){
            System.out.println("the value is present");
        }
      else {
            System.out.println("the value is not present");
        }*/
    /* int [] marks={ 45,65,78,98,23,54,67,};                            question3
       int sum=0;
       for(int i=0;i<marks.length;i++){
           sum=sum+marks[i];}{
           System.out.println(sum);}
        System.out.println(sum/7);
                                                                         question4*/

      /* int [][] size1={{1,2,3},
                       {5,7,9}};
        int [][] size2={{8,4,3},
                       {3,6,9}};
       int [][] size3 ={{0,0,0},
                       {0,0,0}};
       for(int i=0;i<size1.length;i++){
           for ( int j =0;j<size2.length ;j++){
               System.out.format(" value of matrix is i =%d and j=%d \n",i,j);
              // size3[i][j]=size1[i][j]+size2[i][j];
           }
       }  for(int i=0;i<size1.length;i++) {
            for (int j = 0; j < size2.length; j++) {
                System.out.print(size3[i][j] + " ");
                size3[i][j] = size1[i][j] + size2[i][j];
            }
            System.out.println(" ");
        }*/
      /*  int [][] size1={{1,2,3},
                {5,7,9}};
        int [][] size2={{8,4,3},
                {3,6,9}};
        int [][] size3 ={{0,0,0},
                {0,0,0}};
        for(int i=0;i<size1.length;i++){
            for ( int j =0;j<size1[i].length ;j++){
                System.out.format("MAT1: (%d,%d) =%d | ",i,j,size1[i][j]);
                System.out.format("MAT2: (%d,%d) =%d \n",i,j,size2[i][j]);
                size3[i][j]=size1[i][j]+size2[i][j];
            }
        }
        System.out.println("Matrix 3 has vales:");
        for(int i=0;i<size3.length;i++) {
            for (int j = 0; j < size3[i].length; j++) {
                System.out.format("%d ",size3[i][j]);
            }
            System.out.println(" ");
        }*/
                                                                   // question 5
       /* int [] array={ 25,47,53,71,99,84};
        int l= array.length;
        int n =Math.floorDiv(l,2);
        int temp;
        for(int i =0; i<n;i++) {
            temp = array[i];
            array[i] = array[l - 1 - i];
            array[l - 1 - i] = temp;
        }
        for( int element : array){
            System.out.print(element + " ");
        }*/
//       int []array={ 1,4,6,3,5,8,2,9};
      /* int max=0;
        for( int i = 0;i<array.length;i++) {
            if (array[i] > max){
                max = array[i];
        }
            System.out.println(max);

    }*/
    /*    int []array={ 1,4,6,3,5,8,2,9};
        int min=0;
        for( int i = 0;i<array.length;i++) {
            if (array[i] > min){
               min = array[i];
            }
            System.out.println(min);
      else {
                System.out.println(" there is no maximum value  ");
            }
        }
     */
      /*  int[] array = { -1, -2, -2, -1, 0, 1, 2, 2, 1, 0 };
        int max=0;
      //  int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        if (max != Integer.MIN_VALUE) {
            System.out.println(max);
        }
        else {
            System.out.println("No maximum value");
        }*/

      /* int[] array = { -1, -2, -2, -1, 0, 1, 2, 2, 1, 0 ,-8};
       int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        if (min != Integer.MIN_VALUE) {
            System.out.println(min);
        }
        else {
            System.out.println("No minemum value");
        }*/
                                                                                             // question 8

}}
