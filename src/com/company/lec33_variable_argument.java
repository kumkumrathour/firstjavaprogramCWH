package com.company;

//import static java.lang.Long.sum;

//public class lec33_variable_argument {                              it is not giving output it has some error
   /* static int sum( int a, int b){
        return a+b;
    }
    static int sum( int a ,int b, int c)
    {
        return a+b+c;
    }
    static int sum( int a, int b, int c, int d){
        return a+b+c+d;
    }*//* public static void main ( String[] args){
       System.out.println(" welcome to the varargs tutorial ");
       System.out.println(" the sum of 4 and 5 is : " + sum(7,9));
       System.out.println(" the sum of 4,3,and 5is:" + sum (a: 5,b: 7, c: 8);
       System.out.println(" the sum of 4,3,and 5is:" + sum( a : 4,b : 3,c : 5, d : 8));
    static int sum ( int ...arr){*/
    // available as   int [] arr;
       /*int result =0;
        for( int a: arr){
           result +=a;
        }
        return result;
    }
    public static void main ( String[] args){
        System.out.println(" welcome to the varargs tutorial ");
        System.out.println(" the sum of 4 and 5 is : " + sum(7,9));
        System.out.println(" the sum of 4,3,and 5is:" + sum (a: 5,b: 7, c: 8);
        System.out.println(" the sum of 4,3,and 5is:" + sum( a : 4,b : 3,c : 5, d : 8));*/
    import jdk.swing.interop.SwingInterOpUtils;

    import static java.lang.Long.sum;

//   public class lec33_variable_argument {                              this method tell you why you need array in method
                                                                      //    because you can not make number of mathod in main
      /* static int sum( int a, int b){
            return a+b;
        }
        static int sum( int a ,int b, int c){
            return a+b+c;
        }
        static int sum( int a, int b, int c, int d){
            return a+b+c+d;
        }
        static int sum ( int ...arr){
            int result =0;
            for( int a: arr){
                result +=a;
            }
            return result;
        }
        public static void main ( String[] args){
            System.out.println(" welcome to the varargs tutorial ");
            System.out.println(" the sum of 4 and 5 is : " + sum(7,9));
            System.out.println(" the sum of 4,3,and 5is:" + sum (5,7, 8));
            System.out.println(" the sum of 4,3,and 5is:" + sum( 4, 3, 5,  8));

        }
    }*/
  /*  public class lec33_variable_argument {                              //   to make array more short we use var args
    static int sum ( int ...arr){
        int result =0;
        for( int a: arr){
            result +=a;
        }
        return result;
        }
        public static void main ( String[] args){
            System.out.println(" welcome to the varargs tutorial ");
            System.out.println(" the sum of 4 and 5 is : " + sum(7,9));
            System.out.println(" the sum of 4,3,and 5is:" + sum (5,7, 8));
            System.out.println(" the sum of 4,3,and 5is:" + sum( 4, 3, 5, 5,8));
            System.out.println(" the sum of 65,76,83, 32,64and 54is :" +sum (65,76,83,32,64,54));
            System.out.println(" the sum of 54 ,65,65,87,:" + sum ( )); */
//                                                                                                                  you think at least one argument should pass in var args
    public class lec33_variable_argument {                                                                                   // you make x as a compalsary argument
    static int sum (int x ,int ...arr){
        int result =x;
        for( int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main ( String[] args){
        System.out.println(" welcome to the varargs tutorial ");
        System.out.println(" the sum of 4 and 5 is : " + sum(7,9));
        System.out.println(" the sum of 4,3,and 5is:" + sum (5,7, 8));
        System.out.println(" the sum of 4,3,and 5is:" + sum( 4, 3, 5, 5,8));
        System.out.println(" the sum of 65,76,83, 32,64and 54is :" +sum (65,76,83,32,64,54));
        System.out.println(" the sum of 54 ,65,65,87,:" + sum (7 ));
        }}


