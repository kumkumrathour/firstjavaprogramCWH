//package com;
//
//public class Thread_9_synchronized_block {
//    public class Main extends Thread {
//        public void run() {
//            int i = 1;
//            try {
//                for (i = 1; i <= 5; i++)
//                    ;
//                {
//                    System.out.println("Child thread: " + i);
//                    Thread.sleep(1000);
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//        public static void main(String[] args) throws InterruptedException {
//          // Main t = new Main();
//            t.start();
//            t.join();
//            int j = 1;
//            try {
//                for (j = 1; j <= 0; j++)
//                    ;
//                {
//                    System.out.println("Child main: " + j);
//                    Thread.sleep(1000);
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
