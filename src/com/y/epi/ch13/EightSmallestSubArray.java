package com.y.epi.ch13;

import java.util.*;

/**
 * Created by akasha on 3/29/16.
 */
public class EightSmallestSubArray {

    public  static List<String> returnSmallestSubArray(String[] arr, Set<String> set) {
        Map<String, Integer> stringToCountMap = new HashMap();
        int leftIdx = 0;
        int rightIdx = 0;
        int minSubLeftIdx = 0;
        int minSubRightIdx = -1;
        int minLength = arr.length;
        // Find the first candidate substring
        while (rightIdx < arr.length) {

            if (set.contains(arr[rightIdx])) {
                if (stringToCountMap.containsKey(arr[rightIdx]))
                    stringToCountMap.put(arr[rightIdx], stringToCountMap.get(arr[rightIdx]) + 1);
                else
                    stringToCountMap.put(arr[rightIdx], 1);

                if (stringToCountMap.size() == set.size()) {

                    //increase the leftIdx till an entry in the map tends to become 0
                    while (leftIdx <= rightIdx) {
                        if (stringToCountMap.containsKey(arr[leftIdx])) {
                            if (stringToCountMap.get(arr[leftIdx]) == 1) {
                                if (rightIdx - leftIdx < minLength) {
                                    minSubLeftIdx = leftIdx;
                                    minSubRightIdx = rightIdx;
                                    minLength = minSubRightIdx - minSubLeftIdx;
                                }
                                break;
                            } else {
                                stringToCountMap.put(arr[leftIdx], stringToCountMap.get(arr[leftIdx]) - 1);
                            }
                        }
                        leftIdx++;
                    }
                }
            }
            rightIdx++;
        }
        List<String> result = new ArrayList<String>();
        for (int i = leftIdx; i < rightIdx; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
