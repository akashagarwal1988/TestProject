package com.y.epi.ch17;

/**
 * Created by akasha on 2/8/16.
 */
public class ThreeComputeNumberOfWays {

    public static int computeNumberOfWays(int[][] arr){
        int[][] result = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr[0].length;i++){
            result[0][i] = 1;
        }
        for(int i = 0;i<arr.length;i++){
            result[i][0] = 1;
        }

        for(int i = 1;i < arr.length; i++){
            for(int j = 1; j < arr[0].length; j++){
                result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        return result[arr.length-1][arr[0].length-1];
    }
}
