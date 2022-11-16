package com.kunal_dsa_question.flow_of_program;
//https://practice.geeksforgeeks.org/problems/leap-year0943/1
public class leap_year {
    class Solution{
        static int isLeap(int N){
            if((N%400 == 0) || (N%100!=0) && (N%4==0))
            {
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
