package com.y.epi.ch6;

import java.util.Arrays;

/**
 * Created by akasha on 1/31/16.
 */
public class OneDutchNationalFlag {

    public static int[] rearraneDutchNF(int[] arr, int index){
        int pivot = arr[index];
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<pivot)
                count++;
        }
        int low = count;
        int j = 0;
        int k = arr.length -1;
        while(j < low){
            System.out.println("j " + j + " arr[j] " + arr[j] + " k " + k + " arr[k] " + arr[k] + " count " + count);
            System.out.println(Arrays.toString(arr));
            if(arr[j] > pivot && arr[k] < pivot){
                int tmp = arr[k];
                arr[k] = arr[j];
                arr[j] = tmp;

            }
            else if(arr[j] <pivot && arr[k]<pivot){
                j++;
                continue;
            }
            else if(arr[j] >pivot && arr[k]>pivot){
                k--;
                continue;
            }
            if(arr[j] == pivot){
                int tmp = arr[count];
                arr[count] = arr[j];
                arr[j] = tmp;
                count++;
                if(arr[k] != pivot)
                    continue;
            }
            if(arr[k] == pivot){
                int tmp = arr[count];
                arr[count] = arr[k];
                arr[k] = tmp;
                count++;
                continue;
            }

            k--;
            j++;
        }
        while(k > count){
            if(arr[k] == pivot){
                int tmp = arr[count];
                arr[count] = arr[k];
                arr[k] = tmp;
                count++;
                continue;
            }else{
                k--;
            }
        }
        return arr;
    }


}
