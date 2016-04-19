package com.y.epi.ch18;

/**
 * Created by akasha on 2/10/16.
 */
public class EightComputeMaxWaterTrapped {

    public static int computeMaximumWaterTrapped(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while(low < high){
            int xDistance = high - low;
            int yDistance = Math.min(arr[high], arr[low]);
            max = Math.max(max, xDistance * yDistance);
            if(arr[high] < arr[low]){
                high--;
            }else{
                low++;
            }
        }
        return max;
    }
}
