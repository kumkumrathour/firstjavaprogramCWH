package com;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void println(){
        System.out.println( " i am a constructor ");
    }
}
/*class derieved {                                    // in a derieved class we can not use the same function as from the main class so to avoid this we use the inheritance concept
    int x;
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println( " i am setting x now in the  inheritance ");
        this.x = x;
    }
} */
class derived extends Base {                                                        // by this inheritance all the fuction which are available in the base class  are automatically drived in this subclass
   int y ;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }                                                                                                           // amd also we can add new things in it (inheritance )
}
public class lec_45_inheritance {

    public static void main(String[] args) {
        Base b = new Base();                              // this is showing as taking x from base class
        b.setX(6 );
        System.out.println( b.getX());

        Base r = new Base();                              // this is showing as taking y from derieved  class ( base class never excess  value from the derieved class )
       // r.setY( 7 );
     //   System.out.println(r.getY());


      // creating an object of derived class
        derived d =new derived ();                                // this derived class is taking x from the base class
        d.setX( 65 );
        System.out.println( d.getX());

        derived f =new derived ();                                // this derived class is taking y value from its derieved class
        f.setY( 34 );
        System.out.println( f.getY());
    }
}
