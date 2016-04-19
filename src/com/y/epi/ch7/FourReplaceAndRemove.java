package com.y.epi.ch7;

import java.util.Arrays;

/**
 * Created by akasha on 2/4/16.
 */
public class FourReplaceAndRemove {

    public static char[] replaceAndRemove(char[] arr, int size) {
        int k = arr.length - 1;
        int slow = 0;
        int fast = 0;
        //First deleting b's to create space for d's
        while(fast<size){
            while(arr[fast]=='b')
                fast++;
            arr[slow++]=arr[fast++];
        }
        System.out.printf(Arrays.toString(arr));

        /*
        TODO: Find count of a's and then maintain pointer to replace it with double d's
         */
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[--slow]!='a')
                arr[i--] = arr[slow];
            else{
                arr[i--] = 'd';
                arr[i--] = 'd';
            }
        }
        return arr;
    }
}
