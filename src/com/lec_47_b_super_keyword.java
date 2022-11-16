package com;

public class lec_47_b_super_keyword {
    class A{
        int i =19;
    }
    class B extends A {
        int i =35;
        void show (int i )
        {
         //   super( i );
            System.out.println(this. i );
        }

            public static void main ( String[] args ){
           // B r = new B();
          //  r.show( 30):

            }

    }
}
