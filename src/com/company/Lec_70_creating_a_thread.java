package com.company;
class mythread extends Thread{
public void run(){
        while(true){
        System.out.println( " my cooking  thread is running ");
        System.out.println( " i am happy  ");
        }
        }}
class mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println( " thread 2 is running chatting ");
            System.out.println( " i am sad  ");
        }
    }}
public class Lec_70_creating_a_thread {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}
