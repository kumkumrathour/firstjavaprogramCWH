package com;

 class Thread_9_synchronized {
    int total_seat=10;
    void bookseats( int seats){
        if ( total_seat>=seats){
            System.out.println(seats+ " seats book successfullty");
            total_seat=total_seat-seats;
            System.out.println( " seats left :" + total_seat);
        }
        else {
            System.out.println( " sorry seats cannot be booked ");
            System.out.println( " seats left :" + total_seat);
        }
    }
}
class moviesbookapp extends Thread_9_synchronized  {
static Thread_9_synchronized b ;
int seats;
public void run()
        {
            b.bookseats(seats);
        }
        public static void main(String[] args) {
            b = new Thread_9_synchronized();
            moviesbookapp deepal = new moviesbookapp();
            deepal.seats = 7;
           // deepal.start();

            moviesbookapp amit = new moviesbookapp();{
                amit.seats = 6;
               // amit.start();
            }
            }
        }