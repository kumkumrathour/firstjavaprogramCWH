package com.company;

     class Employee{                                                   //  question 1
         int salary ;
         String name;
         public int getsalary(){
             return salary;
         }
         public String getName (){
             return name ;
         }
         public void setName( String  n ){
             name = n;
         }
     }                                                      //    question 2
     class callphone{
         public void ring(){
             System.out.println(" ringing ....");
         }
         public void vibrate (){
             System.out.println( " vibrating ...");
         }
        public void callFrient() {
            System.out.println( " calling palak ....");
        }
     }
     class square {
         int side ;
         public int area(){
             return side*side;
         }
         public int parameter (){
             return 4*side;
         }
     }
     class rectangle {
         int length ;
         int breath;
         public int area (){
             System.out.println("the area of rectanglr ");
             return length * breath;
         }
         public int parameter(){
             System.out.println("the parameter of a rectangle");
             return 2*(length*breath);
         }
         class tommy {
             public void hit () {
                 System.out.println(" hitting the enemy");
             }
                 public void run(){
                     System.out.println("running the enemy");
                 }
                     public void fire(){
                     System.out.println(" firing the enemy");
                 }
             }
         }
         class circle {
         int r ;
         public int area(){
             System.out.println("the area of circle ");
             return 22/7*(r*r);
         }
         }
       public class lec_39_oops_practice {
            public static void main ( String [] args ){
                                                                                          //  problem 1
                /* Employee kunal = new Employee();
                 kunal.setName( " i am feeling as a gift of god ");
                 kunal.salary = 500;
                System.out.println( kunal.getsalary());
                System.out.println(kunal.getName());

                                                                                                //problem 2
                callphone vivo = new callphone();
                vivo.callFrient();
                vivo.vibrate();
               vivo.ring();*/


           /*   square sq = new square();                                                //problem 3
                sq.side =25  ;
                System.out.println( sq.area());
                System.out.println(sq.parameter());*/
                                                                                      // problem 4
              /*  rectangle rt = new rectangle();
                rt.length = 5;
                rt.breath =6;
                System.out.println( rt.area());
                System.out.println(rt.parameter());*/
                                                                                           // problem 5
             /*  tommy player1 = new tommy ();
               player1.hit();
               player1.run();
               player1.fire();*/
                                                                                           // problem 6
                circle cl = new circle();
                cl.r= 7;
                System.out.println(cl.area());
            }

     }
