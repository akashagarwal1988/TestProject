package com.y.epi.ch6;

/**
 * Created by akasha on 1/31/16.
 */
public class SevenBuySellStock {

    public static int maxProfit(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;
        int low = arr[0];
        int maxProfit = 0;
        for(int i =1;i<arr.length;i++){
            maxProfit = Math.max(arr[i] - low, maxProfit);
            low = Math.min(arr[i], low);
        }
        return maxProfit;
    }
}
