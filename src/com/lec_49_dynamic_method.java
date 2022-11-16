package com;
class phone {
    public void great(){
        System.out.println(" good morning ");
    }
    public void name (){
        System.out.println( " my name is java ");
    }
}
class smartphone extends phone {
    public void swagat (){
        System.out.println( " aapaka swagat hai ");
    }
    public void name (){
        System.out.println( " my name is kumkum  in second class ");
    }
}
public class lec_49_dynamic_method {
    public static void main(String[] args) {
      // phone obj = new phone ();            // allow
        //obj.name();
        //smartphone t = new smartphone();     // allow
        //t.name();
       //smartphone r = new smartphone();               // allow
        //r.swagat();
        phone k = new smartphone();                 // this is allow as smartphone inherit phone
        k.great();
        k.name();
      //  k.swagat();
        // output is smartphone name
         //  smartphone j = new phone();                   // this is not allow
        //  j.name();
    }
}
