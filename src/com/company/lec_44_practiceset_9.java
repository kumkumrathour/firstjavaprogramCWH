package com.company;
class cylinder{                                         //find the height and radii of the cylinder by setter and getter
   private int radii;
     private int height;

    public int getradii(){
        return radii;
    }
    public void setradii ( int radii ){
        this.radii= radii ;
    }
    public int getheight(){
        return height;
    }
    public void setHeight( int height ){
        this.height=height;
    }
    public double volume()
    {
        return Math.PI*radii*radii*height;
    }
    public double surfacearea(){
        return 2*3.14*radii*height;
    }
    public double totalsurafacearea(){
        return 2*3.14*radii*radii+2*3.14*height*radii;
    }
    public cylinder ( int radii, int height ){
        this.radii=radii;
        this.height=height;
    }
class  rectangle {
        private int length ;
        private int breath ;
    public rectangle(int height ,int radii ) {
        this.length = 5;
        this.breath=4 ;
    }
   public int getlength(){
        return length;
   }
   public int getBreath(){
        return breath;
   }
   public void setlength( int length){
        this.length=4;
   }
   public void setBreatha( int breath )
   {
       this.breath=5;
   }
}
}

public class lec_44_practiceset_9 {                                                     //problem  1

    public static void main(String[] args) {
       /* cylinder mycylinder=new cylinder();
        mycylinder.setradii(2);
        System.out.println(mycylinder.getradii());
        mycylinder.setHeight(4);
        System.out.println(mycylinder.getheight());
        System.out.println(mycylinder.volume());                              //   problem 2
        System.out.println(mycylinder.surfacearea());
        System.out.println(mycylinder.totalsurafacearea());*/

/*cylinder thiscylinder= new cylinder(4,7);                                        //problem 3
        System.out.println( thiscylinder.getradii());
        System.out.println( thiscylinder.getheight());
        System.out.println(thiscylinder.totalsurafacearea());
        System.out.println();*/
        rectangle r =new rectangle();                                                //problem 4
       // System.out.println(r.getlength())
     //   System.out.println(r.getbreath());
    }
}
