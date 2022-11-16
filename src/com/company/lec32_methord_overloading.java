package com.company;

public class lec32_methord_overloading
{
    static void foo(){
        System.out.println(" good morning bro|");
    }
    static void foo( int a){
        System.out.println(" good morning bro " + a + " bro:");
    }
   // static void telljok(){
      //  System.out.println("i invented a new world\n" +" intervension");

public static void main(String[] args){
    //  telljok();
    //  CASE 1 CHANGING THE INTEGER
  //  int x =45;
  //  System.out.println("the value of x after running change is: " + x);
  //  case2 changing  the array
 //   int[]marks = { 23,54,12,32,54,65,56,45,35,87};
  //  System.out.println( "the value of x after running change is :" + marks[0]);
           foo();
            foo(300);
             foo(500);}
}

