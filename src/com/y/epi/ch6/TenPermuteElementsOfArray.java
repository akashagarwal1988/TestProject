package com.y.epi.ch6;

/**
 * Created by akasha on 2/20/16.
 */
public class TenPermuteElementsOfArray {

    public static char[] permuteElementsOfArray(char[] arr, int[] permutation) {
        for (int i = 0; i < permutation.length; i++) {
            System.out.println("arr = " + arr);
            if (permutation[i] < 0) {
                continue;
            } else {
                int curr = i;
                int pos = permutation[curr];
                if(pos == curr)
                    continue;
                char tmp1 = arr[curr];
                char tmp2 = arr[pos];
                while (permutation[curr] >= 0) {
                    pos = permutation[curr];
                    tmp2 = arr[pos];
                    arr[pos] = tmp1;
                    tmp1 = tmp2;
                    permutation[curr] = -1;
                    curr = pos;

                }
            }
        }
        return arr;
    }
}
