package com.company;
interface Mycamera2{
    void takesnap();
    void recordvedio ();
    //  private void great(){
    //   System.out.println(" good morning ");
    // }
    default void record4kvedio(){
        // great();
        System.out.println( " reconding in 4k...... ");
    }
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork( String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println( " calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println( " connecting ....  ");
    }
}
class MySmartPhone2 extends MyCellPhone implements MyWifi2,Mycamera2{
    public void takesnap(){
        System.out.println( " taking snap");
    }
    public void recordvedio(){
        System.out.println( " taking snap");
    }
    public String[]getNetworks(){
        System.out.println(" getting list of network ");
        String[] networkList = { " harry ", " kumkum", " ankit"};
        return networkList;
    }
    public void connectToNetwork( String network)
    {
        System.out.println( " connect to "+ network);
       // public void sampleMeth2(){
      //  System.out.println( " meth");
  //  }
    }
}
public class lec_59_polymorphism_in_interface {
    public static void main(String[] args) {
        Mycamera2 cam1 = new MySmartPhone2();  // this is a smartphone but use it as a camera
     //   cam1.getNetwork(); --> not allowed
        cam1.record4kvedio();
        MySmartPhone2 s = new MySmartPhone2();
        s.getNetworks();
        s.record4kvedio();
        s.callNumber( 55353);
    }
}
