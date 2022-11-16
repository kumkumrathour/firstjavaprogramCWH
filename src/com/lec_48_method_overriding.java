package com;
class A {
    public int a;
    public int kumkum(){
        return 4;
    }
    public void meth2(){
        System.out.println( " i am method 2 of class A ");
    }
}
class B48 extends A{
    @Override
    public void meth2(){
        System.out.println( " i am method 2 of class B ");
    }
    public void meth3(){
        System.out.println( " i am method 3 of class B ");
    }
}
public class lec_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B48 b = new B48() ;
            b.meth2();
    }}


