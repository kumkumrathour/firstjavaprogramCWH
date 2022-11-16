package com.TCS;

public class linear_search {
    public static void main(String[] args) {
        int[] arr ={ 3 ,6,9,43,67,22,54,66};
        int search = 22;
        for(int i = 0; i<=arr.length-1;i++){
            if(arr[i]==search){
                System.out.println(" the index of a given number is "+i);
            }
        }
    }
}
