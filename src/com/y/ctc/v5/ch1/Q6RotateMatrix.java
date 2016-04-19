package com.y.ctc.v5.ch1;

import java.util.Arrays;

/**
 * Created by aiasha on 12/27/15.
 */
public class Q6RotateMatrix {

    public static int[][] rotateMatrix(int[][] matrix, int N){

        for(int layer = 0; layer<N/2; layer++){
            int first = layer;
            int last = N - 1 - layer;
            for(int i = first; i < last; i++ ){
                int offset = i - first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last - offset][first];

                matrix[last - offset][first] = matrix[last][last - offset];

                matrix[last][last - offset] = matrix[i][last];

                matrix[i][last] = top;
            }

            System.out.println("Matrix after " + (layer + 1) + "+ swap " + Arrays.deepToString(matrix));
        }
        return matrix;
    }
}
