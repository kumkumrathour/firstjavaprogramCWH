package com;
import jdk.swing.interop.SwingInterOpUtils;
class circle3{
    public int radii;
    circle3(){
        System.out.println( " i am default value of circle class 3");
    }
    circle3( int r){
        System.out.println( " i am circle parameter constructor ");
        this.radii =r;
    }
    public double area (){
        return  Math.PI*this.radii*this.radii;
    }
}
class cylinder2 extends circle3{
    public int height ;
    cylinder2( int r ,int h){
        //super(r);
        System.out.println(" i am cylinder 1 parameter constructor ");
        this.height =h;
    }
    public double volume(){
        return Math.PI*this.radii*this.radii*height;
    }
}
public class lec_52_pratice_set {
    public static void main(String[] args) {
        cylinder2 obj= new cylinder2( 2 ,7);               // problem 1
    }
}
