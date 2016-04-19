package com.y.epi.ch13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by akasha on 3/30/16.
 */
public class TenLongestSubArray {

    public static List<String> findLongestSubArrayWithDistinctElements(String[] arr){
        int maxLength = 1;
        int leftIdx = 0;
        int rightIdx = 0;
        int maxLeftIdx = 0;
        int maxRightIdx = 0;
        Set<String> set = new HashSet<String>();
        while(rightIdx < arr.length){
            while(rightIdx < arr.length && !set.contains(arr[rightIdx]) ){
                set.add(arr[rightIdx]);
                rightIdx++;
            }
            if(rightIdx < arr.length && set.contains(arr[rightIdx]) &&  leftIdx <= rightIdx){
                if(rightIdx - leftIdx > maxLength) {
                    maxLeftIdx = leftIdx;
                    maxRightIdx = rightIdx;
                    maxLength = maxRightIdx - maxLeftIdx;
                }
                while(set.contains(arr[rightIdx])){
                    set.remove(arr[leftIdx]);
                    leftIdx++;
                }
            }
        }
        List<String> result = new ArrayList<String>();
        for(int i = maxLeftIdx; i < maxRightIdx;i++){
            result.add(arr[i]);
        }
        return result;
    }
}
