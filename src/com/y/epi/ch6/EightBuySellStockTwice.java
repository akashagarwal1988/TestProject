package com.y.epi.ch6;

/**
 * Created by akasha on 4/8/16.
 */
public class EightBuySellStockTwice {

    public static int buySellStockTwice(int[] arr){
        int[] maxProfitTillDay = new int[arr.length];
        int maxProfit = 0;
        int minValue = arr[0];
        maxProfitTillDay[0] = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > minValue){
                maxProfit = Math.max(maxProfit, arr[i] - minValue);
            }else{
                minValue = arr[i];
            }
            maxProfitTillDay[i] = maxProfit;
        }

        int maxProfit2 = 0;
        int maxValue = arr[arr.length - 1];
        int[] maxProfitFromDay = new int[arr.length];
        maxProfitFromDay[arr.length-1] = 0;
        for(int i = arr.length-2; i >=0; i--){
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }else{
                maxProfit2 = Math.max(maxProfit2, maxValue - arr[i]);
            }
            maxProfitFromDay[i] = maxProfit2;
        }

        int finalMaxProfit = maxProfitTillDay[0] + maxProfitFromDay[1];
        for(int i = 1; i < arr.length-1; i++){
            finalMaxProfit = Math.max(finalMaxProfit, maxProfitFromDay[i+1] + maxProfitTillDay[i]);
        }
        return finalMaxProfit;
    }
}
