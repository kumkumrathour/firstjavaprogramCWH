package com.TCS;

public class binary_search_practice {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int li=0;
        int hi=arr.length-1;
        int mid = (li+hi)/2;
        int search= 26;
        while(li<=hi){
            if(arr[mid]==search){
                System.out.println(" the item is at " + mid +" index");
                break;
            }
            else if(arr[mid]>search){
            hi=mid-1;
            }
            else{
                li=mid+1;
            }
            mid=(li+hi)/2;
        }
    }
}
