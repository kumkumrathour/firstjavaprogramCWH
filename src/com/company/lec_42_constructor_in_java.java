package com.company;
class Mymainemployee{
    private int id;
    private String name;

    public Mymainemployee( String myname, int myid ){
        id = myid ;
        name = myname;
    }
    public Mymainemployee(){
       id = 34;
        name = " kumkum ";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name= n;
    }
    public void setid(int i){
        this.id =i;
    }public int getid(){
        return id;
    }
        }
public class lec_42_constructor_in_java {
   public static void main ( String[] args ){
       Mymainemployee vivi = new Mymainemployee( " vishal ", 32 );
      // vivi.setName(" this is me kumkum ");
      // vivi.setid(43);
       System.out.println(vivi.getid());
       System.out.println(vivi.getName());
   }




}
