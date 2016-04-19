package com.y.pie.ch7;

/**
 * Created by akasha on 1/30/16.
 */
public class BinarySearch {

    public static boolean binarySearch(int[] nums, int val){
        int low = 0;
        int high = nums.length - 1;
        return binarySearchRec(nums, low, high, val);
    }

    public static boolean binarySearchRec(int[] nums, int low, int high, int val){
        if(low > high){
            return false;
        }
        int mid = low + (high - low) / 2;
        if(nums[mid] == val)
            return true;
        else if(nums[mid] > val)
            return binarySearchRec(nums, low, mid - 1, val);
        else
            return binarySearchRec(nums, mid + 1, high, val);
    }
}
