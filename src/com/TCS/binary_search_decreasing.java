package com.TCS;

public class binary_search_decreasing {
    public static void main(String[] args) {
        int[] arr={20,18,16,14,12,10,8,6,4,2,1};
        int li=0;
        int hi=arr.length-1;
        int search = 28;
        int mid = ( hi+li)/2;
        while(li<=hi){
            if(arr[mid]==search){
                System.out.println("the index of an number is "+mid);
                break;
            }
            else if(arr[mid]>search){
                li=mid+1;
            }
            else{
                hi=mid-1;
            }
            mid =(li+hi)/2;
        }
        while(li>=hi){
            System.out.println(" the index of a number is "+ -1);
            break;
        }

    }
}
