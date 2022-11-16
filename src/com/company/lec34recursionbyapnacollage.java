package com.company;

import org.w3c.dom.ls.LSOutput;

public class lec34recursionbyapnacollage {
    /*  public static void printnumb(int n)                     //  question 1 print the no. 5 to 1
{
    if ( n==0 ) {
        return;
    }
    System.out.println(n);
    printnumb( n-1);
         }
         public static void main (String[] args)
         {
             int n = 5;
             printnumb(n);
         }*/
  /* public static void printnumb(int n)                     //  question 2 print the no. 1 to 5
    {
        if ( n==6 ) {
            return;
        }
        System.out.println(n);
        printnumb( n+1);
    }
    public static void main (String[] args)
    {
        int n =1;
        printnumb(n);
}*/
 /* public static void printsum(int i, int n ,int sum)                     //  question 3 print the sum of n number
    {
        if ( i==n ) {
            sum+=i;
            System.out.println(sum);
           // System.out.println(i);
            return;
        }
          sum +=i ;
        printsum(i+1,n,sum);
       // System.out.println(sum); this line print sum of every steps
    }
    public static void main (String[] args)
    {
        int n =1;
        printsum( 1,10,0);
}*/
  /*  public static void printsum(int i, int n ,int product)                     //  question 4 factorial of n number
    {
        if ( i==n ) {
          // product*=i;         no need of this line
            System.out.println(product);
            // System.out.println(i);                  no need of this line
            return;
        }
       product *=i ;
        printsum(i-1,n,product);
    }
    public static void main (String[] args)
    {
       // int n =1;                                      no need of this line
        printsum( 6,1,1);
}
*/
/*    public static void printFib(int a, int b ,int n)                     //  question 5 fibonacci series ///////
    {
      if( n==0){
            return;
        }
       int c = a+b;
         System.out.println(c);
         printFib( b , c ,n-1);
    }
    public static void main (String[] args)
    {
        int a =0 ,b = 1;
        System.out.println(a);
        System.out.println(b);
        int n= 7;
//        printFib( a , b , n-2);

}*/
  /* public static int calcpower ( int x, int n){                             // question 6 fint the x ki power n .
        if( n ==0)
        {
            return 1;
        }
        if( x==0 )
       {
           return 0;
       }
        int xpower1 = calcpower ( x, n-1);
        int xpower = x * xpower1;
        return xpower;
    }
    public static void main ( String args[])
    {
        int x =2, n=5;
        int ans = calcpower( x,n);
        System.out.println(ans);
    }
        */
    public static int calcpower(int x, int n) {                          // QUESTION 7 calculate x ki power n but  height of the stack is log n
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
       if ( n % 2== 0){
           return calcpower ( x, n/2)* calcpower ( x, n/2);
       }
       else {
           return calcpower ( x, n/2) * calcpower ( x, n/2 )* x;
       }
    }

    public static void main(String args[]) {
        int x =3, n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}