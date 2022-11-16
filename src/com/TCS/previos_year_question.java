package com.TCS;
import java.util.Scanner;
public class previos_year_question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr= new int[num];
        for(int i=0 ;i<num; i++)
            arr[i]=sc.nextInt();
        int num2 = sc.nextInt();
        int s=sc.nextInt();
        boolean found = false;
        for(int i = 0; i<num; i+=s){
            found =false;
            for(int j=0;j<i+s && j<num; j++){
                if(arr[j]==2 )
                found = true;
            }
            if(found)
                continue;
            else{
                System.out.println(0);
                System.exit(0);

            }
        }
        System.out.println(1);
    }
}
