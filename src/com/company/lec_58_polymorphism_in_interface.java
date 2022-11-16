package com.company;
interface sampleinterface {
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3 ();
    void meth4();
}
class Mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println(" meth1");
    }
    public void meth2(){
        System.out.println(" meth2");
    }
    public void meth3(){
        System.out.println(" meth3");
    }
    public void meth4(){
        System.out.println(" meth4");
    }
}
public class lec_58_polymorphism_in_interface {
    public static void main(String[] args) {
        Mysampleclass obj = new Mysampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
