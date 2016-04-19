package com.y.epi.ch17;

import com.y.com.y.common.utils.Item;

import java.util.List;

/**
 * Created by akasha on 3/7/16.
 */
public class SixKnapSackProblem {
    public static int knapsackProblemt(List<Item> items, int capacity){

    int[][] matrix = new int[items.size()][capacity + 1];

        for(int i = 0; i <  matrix[0].length; i++){
            if(items.get(0).weight > i){
                matrix[0][i] = 0;
            }else{
                matrix[0][i] = items.get(0).value;
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                int withThis = items.get(i).weight > j ? matrix[i-1][j] : items.get(i).value + matrix[i-1][j - items.get(i).weight];
                int withoutThis = matrix[i-1][j];
                matrix[i][j] = Math.max(withThis, withoutThis);
            }
        }

        return matrix[items.size() - 1][capacity];

    }


}



