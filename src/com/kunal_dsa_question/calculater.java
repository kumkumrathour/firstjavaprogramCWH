package com.kunal_dsa_question;
import java.util.Scanner;
public class calculater {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            char op = in.next().trim().charAt(0);
            if(op =='+' || op =='-' || op=='/' || op=='*'){
             System.out.println("input two number");
             int num1 = in.nextInt();
             int num2 = in.nextInt();
             if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    ans = num1/num2;
                }else if(op == 'x'|| op=='X'){
                    break;
                }else{
                    System.out.println("invalid number");
                }
            }
            System.out.println(ans);
        }

    }
}
