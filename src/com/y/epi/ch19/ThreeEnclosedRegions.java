package com.y.epi.ch19;

import java.util.Arrays;

/**
 * Created by akasha on 3/6/16.
 */
public class ThreeEnclosedRegions {
    static boolean[][] visited;
    public static void markEnclosedRegions(boolean[][] matrix){
        visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(!matrix[i][j] && !visited[i][j] && (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[0].length-1)){
                    markBoundaryAsVisited(matrix, i, j);
                }
            }
        }

        for(int i = 0;i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(!matrix[i][j] && !visited[i][j]){
                    matrix[i][j] = true;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void markBoundaryAsVisited(boolean[][] matrix, int i , int j){
        visited[i][j] = true;
        if(i>0 && !matrix[i-1][j] && !visited[i-1][j]){
            markBoundaryAsVisited(matrix, i-1, j);
        }
        if(j>0 && !matrix[i][j-1] && !visited[i][j-1]){
            markBoundaryAsVisited(matrix, i, j-1);
        }
        if(i<matrix.length-1 && !matrix[i+1][j] && !visited[i+1][j]){
            markBoundaryAsVisited(matrix, i+1, j);
        }
        if(j<matrix[0].length-1 && !matrix[i][j+1] && !visited[i][j+1]){
            markBoundaryAsVisited(matrix, i , j+1);
        }
    }
}
