package com;

public class Thread_7_join extends Thread{
    public  void run() {
        try {
            for (int i = 1; i<=5; i++) ;{
              // System.out.println(i + " child thread");
                Thread.sleep( 1000);
            }}
           catch ( Exception e){
               System.out.println( e);
           }
        }

    public static void main(String[] args) throws  InterruptedException
    {
        Thread_7_join t = new Thread_7_join();
        t.start();
        t.join();
        try {
            for (int i = 1; i <= 0; i++) ;
            {
              //  System.out.println(" child main " +i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }}


