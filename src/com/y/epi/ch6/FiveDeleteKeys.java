package com.y.epi.ch6;

/**
 * Created by akasha on 3/31/16.
 */
public class FiveDeleteKeys {

    public static int[] deleteKeysFromArray(int[] arr, int key) {

        int writeIdx = 0;
        int readIdx = 0;
        while (readIdx < arr.length) {
            while (arr[readIdx] == key) {
                readIdx++;
            }
            arr[writeIdx++] = arr[readIdx++];
        }
        return arr;
    }
}
