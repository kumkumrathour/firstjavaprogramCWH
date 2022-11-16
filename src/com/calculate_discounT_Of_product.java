package com;

public class calculate_discounT_Of_product {
    public static void main(String[] args){
    float cost = 19000f,i,total=0,discount=0;
    if(cost<20000){
        discount=cost*0.05f;
        total=cost-discount;
        System.out.println("discount"+discount+"total"+total);
    }
    else if (cost>=20000 & cost<=40000){
        discount=cost*0.07f;
        total=cost-discount;
        System.out.println("discount"+discount+"total"+total);
    }
    else if(cost>=40000 & cost<=70000){
        discount=cost*0.10f;
        total=cost-discount;
        System.out.println("discount"+discount+"total"+total);
    }
    else if(cost>=70000){
        discount=cost*12.5f;
        total=cost-discount;
        System.out.println("discount"+discount+"total"+total);
    }
}}
