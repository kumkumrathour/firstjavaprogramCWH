package com.company;

public class thread_2_deamon extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println( " daemon thread ");
        }
        else {
            System.out.println( " child thread ");
        }
      //  System.out.println( Thread.currentThread().isDaemon());
     //   System.out.println( " deoman thread");
    }

    public static void main(String[] args) {
      //  System.out.println( " main thread");
        thread_2_deamon t = new thread_2_deamon();
      //  t.start();
        t.setDaemon(false );
        t.start();
    }
}
