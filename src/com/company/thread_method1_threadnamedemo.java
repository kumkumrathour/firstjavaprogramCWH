package com.company;
 class just extends Thread{
    public void run(){
        System.out.println( " thread task is executed by: " + Thread.currentThread().getName());
        System.out.println( " hello thread :"+ Thread.currentThread().getName());
    }

}
public class thread_method1_threadnamedemo  {
    public static void main(String[] args) {
       // System.out.println( " hello ");
       // System.out.println( Thread.currentThread().getName());
        //Thread.currentThread().setName( " love from kumkum ");
      //  System.out.println(" new Thread name : "+ Thread.currentThread().getName());
      //  System.out.println(10/0);
        System.out.println( " helllo is printed by :" + Thread.currentThread().getName());
        just t1 = new just();
        t1.start();
        just t2 = new just();
        t2.setName( " love to  kumkum ");
        t2.start();
    }
}
