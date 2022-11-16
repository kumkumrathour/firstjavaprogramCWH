package com;

public class multithreading_smart_programming extends Thread {
    public void run() {
        System.out.println(" thread task ");
    }

    public static void main(String[] args) {
        multithreading_smart_programming t = new multithreading_smart_programming();
        t.start();
    }
}


