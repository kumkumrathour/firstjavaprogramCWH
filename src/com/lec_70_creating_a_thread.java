package com;
class MyThread1 extends Thread{

    public void run()
    {
        while( true ){
            System.out.println( " my thread is runnning ");
            System.out.println( "  i am happy ");
        }
    }
}
class MyThread2 extends Thread{
    public void run()
    {
        while( true ){
            System.out.println( " thread 2 is running  ");
            System.out.println( "  i am sad  " );
        }
    }
}
public class lec_70_creating_a_thread {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    t1.start();
}}
