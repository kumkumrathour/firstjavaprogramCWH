package com;

public class Thread_8_interrupt {
    public void run(){
        try {
            for( int i= 1; i<=5;i++){
                System.out.println(i);
            Thread.sleep(1000);
        }
    }
    catch ( Exception e){
        System.out.println( " Thread interruption " + e);
    }
}

    public static void main(String[] args) {
        Thread_8_interrupt t3= new Thread_8_interrupt();
       // t3.start();
        //t3.interrupt();
    }}