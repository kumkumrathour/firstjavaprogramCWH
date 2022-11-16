package com;
abstract class parents2 {                                        // just because in line 9 we make a abstract method we make abstract class
    public parents2(){                                                                 // this is a constructor
        System.out.println(" ma parents 2 ka consturctor ho ");
    }
    public void sayhello(){
        System.out.println( " hello ");
    }
    abstract public void great();                                        // abstract class method ha ya
    abstract public void great2();
}
class child2 extends parents2{
    @Override
    public void great(){
        System.out.println(" this is child 2 of subclass");
    }
    @Override
    public void great2(){
        System.out.println(" this is child 2 of subclass with one more great");
    }
}
abstract class child3 extends parents2{
    public void th(){
        System.out.println(" this is child 3 of different subclass  ");
    }
}
public class lec_53_abstract
{
    public static void main(String[] args) {
        child2 c=new child2();
      //  child3 d = new child3();
    }
}


