package com.company;

public class thread_6_yield_sleep extends Thread {
    public void run()
    {
        Thread.yield();
        for ( int i=1;i<=5;i++){
            System.out.println( Thread.currentThread().getName()+  " - " + i);
        }
    }

    public static void main(String[] args) {
        thread_6_yield_sleep t= new thread_6_yield_sleep();
        t.start();
      //  Thread.yield();
        for ( int i =1 ; i<=5 ; i++){
            System.out.println( Thread.currentThread().getName() + " -" + i);
        }
    }
}
