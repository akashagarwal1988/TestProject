package com.y.Misc;

/**
 * Created by akasha on 4/18/16.
 */
public class FindMaxAreaIsland {
    static char[][] map = new char[][]{
            {'W','W','W','W','L','L','W','W','W'},
            {'W','W','W','W','L','W','W','W','W'},
            {'L','W','W','W','L','L','L','W','W'},
            {'L','L','W','W','W','W','W','L','L'},
            {'L','W','W','W','W','W','W','L','L'}
    };

    static int currArea = 0;
    public static void main(String[] args){
        boolean[][] isVisited = new boolean[map.length][map[0].length];
        int maxArea = 0;
        for(int i = 0; i< map.length; i++){
            for(int j = 0; j< map[0].length; j++){
                if(map[i][j] == 'L' && !isVisited[i][j]){
                    performDFS(map, i , j, isVisited);
                    maxArea = Math.max(currArea, maxArea);
                    currArea = 0;
                }
            }
        }
        System.out.println("max area is " + maxArea);
    }

    public static void performDFS(char[][] map, int i , int j , boolean[][] isVisited){
        isVisited[i][j] = true;
        currArea++;
        if(i > 0 && map[i-1][j] == 'L' && !isVisited[i-1][j]){
            performDFS(map, i-1, j, isVisited);
        }
        if(j > 0 && map[i][j-1] == 'L' && !isVisited[i][j-1]){
            performDFS(map, i, j-1, isVisited);
        }
        if(i < map.length-1 && map[i+1][j] == 'L' && !isVisited[i+1][j]){
            performDFS(map, i+1, j, isVisited);
        }
        if(j < map[0].length-1 && map[i][j+1] == 'L' && !isVisited[i][j+1]){
            performDFS(map, i, j+1, isVisited);
        }
    }
}
