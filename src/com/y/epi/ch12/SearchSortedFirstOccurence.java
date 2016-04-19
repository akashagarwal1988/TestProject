package com.y.epi.ch12;

/**
 * Created by akasha on 2/1/16.
 */
public class SearchSortedFirstOccurence {

    public static int returnIndexFirstOccurence(int[] arr, int val){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            System.out.println("arr[low] " + arr[low] + " low " + low + " mid " + mid);
            if(arr[low] == val)
                return low;

            if(arr[mid] >= val){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
