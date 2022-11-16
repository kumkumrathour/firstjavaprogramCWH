package com.company;
class Myemployee {
     private int id ;
     private String name;

public String getName(){
    return name;
}
public void setName ( String n ){
    name = n;
}
public void setid( int i){
    id =i;
}
public int getid(){
    return id;
}
}
public class lec_40_getter_setter
{
    public static void main(String[] args) {
        Myemployee ankit = new  Myemployee();
      //  ankit.id=43;                             ((  throws an error due to private acces modifier ))
      // ankit.name = " vivaan ";
        ankit.setName( " code with kumkum ");
       System.out.println(ankit.getName());
        ankit.setid( 342 );
        System.out.println(ankit.getid());
    }

}
