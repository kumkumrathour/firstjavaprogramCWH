package com;
/*                                                                        // constructor in inheritance
class base1{
    base1(){
        System.out.println( " i am a constructor ") ;
    }
}
class derived1 extends base1
{
    derived1(){
        System.out.println( " i am a derived class constructor =");
    }
}
public class lec_46_constructor_inheritance {
    public static void main(String[] args) {
        base1 b = new base1();
        derived1 d = new derived1( );
    }
}*/
class base1{                                                                   // constructor overloading in inheritance
    base1(){
        System.out.println( " i am a constructor ") ;
    }
    base1( int a ){
        System.out.println( " i am a constructor overloader = " + 3);
    }
}
class derived1 extends base1
{
    derived1(){
      //  super(4);
        System.out.println( " i am a derived class constructor =");
    }
    derived1( int b ,int c ){
        System.out.println( " i am a derived class constructor  overloader =" + 5);
    }
}
public class lec_46_constructor_inheritance {
    public static void main(String[] args) {
        base1 b = new base1(54);
        derived1 d = new derived1( 6,8);
    }
}