package com.kunal_dsa_question;
import java.util.Scanner;
public class electricity_bill {
    String n;
    int units;
    double bill;

    void accept(){
    Scanner in= new Scanner(System.in);
    System.out.println("enter the number of customer");
    n = in.nextLine();
    System.out.println("enter the number of unit consume by consumer ");
    units = in.nextInt();
    }
    void calculate(){
        if (units<=100)
            bill= 2*units;
        else if(units>100 && units<=300)
            bill =2*100+(units-100)*3;
        else if (units>300)
        {
            bill=2*100 +3*200+(units-300)*5;
            bill= bill+2.5*bill/100;
        }
    }
    void print(){
        System.out.println("name of the customer: "+ n);
        System.out.println("number of units consumed:"+units);
        System.out.println("bill amount:"+bill);
    }
    public static void main(String args[]){
        electricity_bill obj = new electricity_bill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
