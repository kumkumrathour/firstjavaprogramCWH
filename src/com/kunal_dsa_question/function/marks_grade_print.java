package com.kunal_dsa_question.function;
import java.util.Scanner;
public class marks_grade_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks ");
        int m=sc.nextInt();
        int ans = marks(m);
        System.out.println("the marks you will get is "+m);

    }
    static int marks(int m){

        if ( m<=40){
            System.out.println("you are failed in this examination");
        }
        else if (m<=50){
            System.out.println("your grade isDD");
        }
        else if (m<=60){
            System.out.println("your grade is CD");
        }
        else if (m<=70){
            System.out.println("your garde is BC");
        }
        else if (m<=80){
            System.out.println("your garde is BB");
        }
        else if (m<=90){
            System.out.println("your garde is AB");
        }
        else {
            System.out.println("your garde is AA");
        }
        return m;
    }


}
