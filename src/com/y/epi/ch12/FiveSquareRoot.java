package com.y.epi.ch12;

/**
 * Created by akasha on 2/5/16.
 */
public class FiveSquareRoot {

    public static int ComputeSquareRoot(int number){
        int low = 1;
        int high = number /2;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int midSquare = mid * mid;
            if(midSquare == number)
                return mid;
            if(midSquare < number){
                low = mid + 1;
            }
            if(midSquare > number){
                high = mid - 1;
            }
        }
        return low - 1;
    }
}
