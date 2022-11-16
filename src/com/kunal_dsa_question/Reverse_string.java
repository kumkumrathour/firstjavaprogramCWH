package com.kunal_dsa_question;

public class Reverse_string {
    public static void main(System[] args){
        String name="kumkum";
        int leng=name.length();
        String rev ="";
        for(int i=leng-1; i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("name"+"is"+"rev");
    }
}
