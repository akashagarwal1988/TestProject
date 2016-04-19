package com.y.epi.ch16;

import java.util.Arrays;

/**
 * Created by akasha on 2/6/16.
 */
public class TwoNQueenProblem {

    public static int[][] SolveNQueen(int[][] arr, int N) {
        solveRecurNQueen(arr, N, 0);
        return arr;
    }

    public static void solveRecurNQueen(int[][] arr, int N, int row) {
        if (row == N) {
            System.out.printf("Result " + Arrays.deepToString(arr));;
        } else {
            for (int col = 0; col < N; col++) {
                if (isValidMove(arr, row, col, N)) {
                    arr[row][col] = 1;
                    solveRecurNQueen(arr, N, row + 1);
                    if (row < N)
                        arr[row][col] = 0;
                }
            }
        }
    }

    public static boolean isValidMove(int[][] arr, int row, int col, int N) {
        //Row check
        for (int i = 0; i < N; i++) {
            if (arr[row][i] == 1)
                return false;
        }

        //Column Check
        for (int i = 0; i < N; i++) {
            if (arr[i][col] == 1)
                return false;
        }

        //Diag Check
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Math.abs(row - i) == Math.abs(col - j) && arr[i][j] == 1)
                    return false;
            }
        }
        return true;


    }
}
