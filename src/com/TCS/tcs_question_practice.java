package com.TCS;
import java.lang.*;
import java.io.*;
public class tcs_question_practice {
        public static void main(String[] args)throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n,i,j;
            {
                System.out.print("enter n value");
                n = Integer.parseInt(br.readLine());
                for(i=1;i<=n;i++)
                {
                    for (j=1;j<i;j++)
                    {
                        System.out.print((i)+"*");
                    }
                    System.out.print(i);
                }
                for(j=1;j<i;j++){
                    System.out.print((i)+"*");
                }
                System.out.print(i);
            }}}
