package com.company;

public class Thread_5_sleep_program extends Thread{
    public void run(){
        try
        {
            for( int i=1;i<=5;i++){
            System.out.println(i  + " : " + Thread.currentThread().getName() );
            Thread.sleep(1000);
        }}
        catch ( Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Thread_5_sleep_program t =new Thread_5_sleep_program();
       // t .start();
        Thread_5_sleep_program  t2= new Thread_5_sleep_program();
       // t2.start();
        t.run();
        t2.run();
    }
}
