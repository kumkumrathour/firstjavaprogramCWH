package com.company;

public class Thread_4_sleep_function  extends Thread
{
    public void run(){
        for( int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println( e );
            }

            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Thread_4_sleep_function t= new Thread_4_sleep_function();
        t.start();
    }
}
