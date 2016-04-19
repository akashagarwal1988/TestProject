package com.y.epi.ch12;

/**
 * Created by akasha on 2/21/16.
 */
public class SevenSearchIn2DSortedArray {

    public static boolean findNumber(int[][] matrix, int number) {
        int x = 0;
        int y = matrix[0].length-1;
        while (x < matrix.length && y >= 0) {
            if (matrix[x][y] == number) {
                return true;
            } else if (matrix[x][y] > number){
                y--;
            }else {
                x++;
            }
        }
        return false;
    }
}
