package com.y.epi.ch6;

/**
 * Created by akasha on 3/31/16.
 */
public class FourAdvancingThruArray {

    public boolean isReachable(int[] arr){
        int maxReachable = 0;
        for(int i = 0; i< arr.length; i++){
            if(i > maxReachable)
                return false;
            else if(maxReachable >= arr.length - 1)
                return true;
            else{
                maxReachable = Math.max(maxReachable, i + arr[i]);
            }
        }
        return false;

    }
}
