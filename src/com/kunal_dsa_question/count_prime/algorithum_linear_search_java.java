package com.kunal_dsa_question.count_prime;

public class algorithum_linear_search_java {
    public static void main(String[] args) {
        int[] arr ={ 5,3,6,1,4,2};
        int item=1;
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]== item){
                System.out.println(" item is present at "+ i);
            }

        }
    }
}
