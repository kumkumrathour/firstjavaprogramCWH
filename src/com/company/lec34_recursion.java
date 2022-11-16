package com.company;

/*public class lec34_recursion
{
    // factorial (n) = n* n-1* ......1
        // factorial (7)= 7 * 6 * 5 * 4 * 3 * 2 * 1 = 120
    // factorial (n) = n * factorial ( n-1 )
    // factorial (0) = 1
         static  int factorial( int n ){
         if ( n==0 || n ==1 )
        {
           return 1;
    }
else {
         return n * factorial(n-1);
         }
              public static void main(String[] args){
                     int x =5 ;
                   System.out.print(" the value is :" + factorial(x));

}
         }  */
    public class lec34_recursion
    {
        // This is recursive method
        static  int factorial( int n ){

            if ( n==0 || n ==1 ){
                return 1;
            }
            else {
                return n * factorial(n-1);
            }
        }

        // This is iterative method
        static int factorial_iterative(int n ){

            if ( n==0 || n ==1 ){
                return 1;
            }
            else {
                int product = 1;
                for ( int i =1;i<=n;i++){
                    product *=i;
                }
                return product ;
            }

        }


        public static void main(String[] args){
            int x =5 ;
            System.out.print(" the value is :" + factorial(x));
            System.out.print(" the value is :" + factorial_iterative(x));
        }
    }
/*static int factorial_interative(int n ){                              //factorial_interative

        if ( n==0 || n ==1 )
        {
            return 1;
        }
        else {
          int product = 1;
        for ( int i =1;i<=1;i++){
product *=i;
return product ;
}
}public static void main(String[] args){
            int x =5 ;
            System.out.print(" the value is :" + factorial_iterative(x));*/
