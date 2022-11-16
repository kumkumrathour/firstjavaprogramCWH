package com;
abstract class Pen {                                                  //  question 1
    abstract void write();
    abstract void refill();
}
class Fountainpen extends Pen {
    void write(){
        System.out.println( "  this is the writing skill ");
    }
    void refill (){
        System.out.println( " this is the refill method ");
    }
    void changeNib(){
        System.out.println(" changing the nib is as ");
    }
}                                                                           // question2
class Monkey {
    void jump(){
        System.out.println( " jumping ........");
    }
    void bite()
    {
        System.out.println( " bite.....");
    }
}
interface BasicAnaimal {
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnaimal {
    void speak (){
        System.out.println( " hello sir .... ");
    }
    public void eat (){
        System.out.println(" basicanimal eat human ");
    }
    public void sleep (){
        System.out.println( " basicanimal sleep human ");
    }
}
public class lec_60_practice_of_interface {
    public static void main(String[] args) {
        Fountainpen pen = new Fountainpen() ;                                // question 1
        pen.changeNib();
                                                                                 // question 2
        Human kumkum = new Human();
        kumkum.speak();
        kumkum.eat();
        kumkum.sleep();
        kumkum.jump();
        kumkum.bite();
        Monkey kum= new Human();
        kum.jump();
        kum.bite();
       // kum.speak();            // -- > cannot use speak method because the reference is monkey which does not have speak method
       // kum.eat();              // monkey does not extends human
        BasicAnaimal kunal =new Human();
        kunal.eat();
       // kunal.speak();                     // baseicanimal is a interface which has only object of eat and sleep so it does not make output of speak and jump
       // kunal.jump();                      // because speak and jump are both in human and monkey class



    }

}
