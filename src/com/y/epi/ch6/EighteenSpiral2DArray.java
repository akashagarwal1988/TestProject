package com.y.epi.ch6;

/**
 * Created by akasha on 2/4/16.
 */
public class EighteenSpiral2DArray {

    public static void printSpiral(int[][] arr){
        int i = 0, j = arr.length - 1;
        while(true){
            if(i == j){
                System.out.printf("->" + arr[i][j]);
                break;
            }else if(i > j){
                break;
            }
            for(int k = i; k < j; k++ ){
                System.out.printf("->" + arr[i][k]);
            }
            for(int k = i; k< j;k++){
                System.out.printf("->" + arr[k][j]);
            }
            for(int k = j; k > i;k--){
                System.out.printf("->" + arr[j][k]);
            }
            for(int k = j;k > i; k--){
                System.out.printf("->" + arr[k][i]);
            }
            i++;
            j--;
        }
    }
}
