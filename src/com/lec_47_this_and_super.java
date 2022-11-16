package com;
/*class Ekclass {
    int a;

   public int getA() {
        return a;
    }

    Ekclass(int v ){
        a=v;
    }
    public int returnone(){
        return 1;
    }
}*/    /*class a {                                                                  // print unique reference no. of a class with objet + this method
    void show()
    {
        System.out.println(this);
    }
}*/
/*class A                                                                       // in this question is we will not use " this " jvm get confused that which  in instance and this is local
{
    int a;
    A(int a){
        a=a;                                                                   // but now we apply " this" in frunt of a jvm know that now which is near of "this " , a is a instance veriable
    }
    void show(){
        System.out.println(a);
    }
}*/
class B47
{
    B47(){
        System.out.println( " this is me kumkum ");
    }
    B47 (int b ){
       this();                                                                       // "this" call defalt constructor of classB
        System.out.println(b );                                                         // is "this" is not return then  class take a value from the object and 400 is print in output
    }
}


public class lec_47_this_and_super {
    public static void main(String[] args) {
       // Ekclass e = new Ekclass( 567);
        /*  a r=new a();
            System.out.println(r);
              r.show();
          A ra= new A( 34 );
              ra.show();*/
        B47 rat =new B47(400);
    }
}
