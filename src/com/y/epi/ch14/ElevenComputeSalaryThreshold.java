package com.y.epi.ch14;

import java.util.Arrays;

/**
 * Created by akasha on 4/3/16.
 */
public class ElevenComputeSalaryThreshold {

    public static int computeSalaryThreshold(int[] arr, int target){
        int sumTillNow = 0;
        // Iterate through array, if current entry times array length is less than target, check the next one.
        // If not calculate sum till now and threshold will be remaining - sumTillNow / remaining Entries
        Arrays.sort(arr);
        for(int i = 0;i < arr.length; i++){
            if(arr[i] * arr.length < target){
                sumTillNow = sumTillNow + arr[i];
                continue;
            }else{
                int remaining = target - sumTillNow;
                return remaining / (arr.length - i);
            }
        }
        return arr[arr.length-1];
    }
}
