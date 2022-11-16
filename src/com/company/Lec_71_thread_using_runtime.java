package com.company;
class mythread1 implements Runnable{
    public void run(){
        System.out.println( " i am bullet1 shoot ");
    }
}
class mythread22 implements Runnable{
    public void run(){
        System.out.println( " i am bullet2 shoot at present  ");
    }
}
     public class Lec_71_thread_using_runtime
{
    public static void main(String[] args) {
        mythread1 bullet1 =new mythread1();
        Thread gun1 = new mythread();
        gun1.start();
        mythread2 bullet2 = new mythread2();
        Thread gun2 = new mythread2();
        gun2.start();
    }
}
