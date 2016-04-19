package com.y.epi.ch17;

import java.util.Arrays;

/**
 * Created by akasha on 2/3/16.
 */
public class OneCountNumberOfScoreCombos {

    public static int returnNumberOfCombinations(int[] arr, int sum){
        int[][] result = new int[arr.length][sum+1];
        for(int i =0;i<arr.length;i++){
            result[i][0]=1;
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 1; j<=sum;j++){
                int withSum = j-arr[i] >= 0 ? result[i][j-arr[i]] : 0;
                result[i][j] = i > 0 ? result[i-1][j] + withSum : withSum;
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result[arr.length-1][sum];
    }
}
