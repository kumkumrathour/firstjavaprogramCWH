package com.company;
class c1 {
    private int r= 5;
    int y = 34;
    protected int z = 87;
    public int w = 23;
    public void meth1 () {
       // System.out.println( x);
        System.out.println( y);
        System.out.println( z);
        System.out.println(w);
    }
    }
public class lec_66_access_modifiers
{
    public static void main(String[] args) {
        c1 c = new c1();
       // c.meth1();
       // System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.w);
        System.out.println(c.z);

    }
}
