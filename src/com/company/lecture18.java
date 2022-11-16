package com.company;
import java.util.Scanner;
public class lecture18 {
    public static void main( String[] args){
       // int age=65;
        //if(age>=56){
           // System.out.println(" you are experienced!");
       // }
   // else
      // if (age>46) {
          // System.out.println("you are semi experienced");
      // } else if (age>36)
           //System.out.println(" you are under experienced ");
       // else if (age>26)
            //System.out.println("you are just experenced ");
       // else System.out.println(" you are not experenced");
      // int age;
     //   System.out.println(" enter your age ");
       Scanner sc = new Scanner(System.in);
       //     age= sc.nextInt();
       //  switch (age)
       // {
         //  case 10:
               // System.out.println("=10");
             //   break;
         //  case 20:
               //     System.out.println("20");
                //    break;
          // case 30:
                   //     System.out.println("=30");
                      //  break;
            //default:
               //System.out.println(" none of the above");
       // }
               //System.out.println(" thank for using my java program!");
       // char var= 'f';
       // switch ( var) {
//            case 'c':
//                System.out.println(" you are going to become a adult");
//                break;
//            case 'r':
//                System.out.println(" you are going to join the job ");
//                break;
//            case 'd':
//                System.out.println(" you are going to get retired ");
//                break;
//            default:
//                System.out.println(" you are not a healthy person ");
//                break;
//        }
//                System.out.println(" thanks for joining this program ");
        System.out.println(" enter any alphabet:");

        String alpha= sc.next();
        switch(alpha){
            case "A","E","I","O","U"->System.out.println("vowel");
            case "a","e","i","o","u"-> System.out.println(" vowel...");
            default-> System.out.println("consonant");
        }



        }

}

