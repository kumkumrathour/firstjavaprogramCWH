package com.company;
interface Mycamera{
    void takesnap();
    void recordvedio ();
  //  private void great(){
     //   System.out.println(" good morning ");
   // }
    default void record4kvedio(){
       // great();
        System.out.println( " reconding in 4k......");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork( String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println( " calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println( " connecting ....  ");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,Mycamera{
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
    }
}

public class lec_57_default_interface {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kvedio();
        String[] ar =ms.getNetworks();
        for ( String item : ar){
            System.out.println(item);
        }
    }
}

