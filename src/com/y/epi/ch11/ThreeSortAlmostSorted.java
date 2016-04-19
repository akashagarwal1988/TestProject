package com.y.epi.ch11;

import java.util.PriorityQueue;

/**
 * Created by akasha on 2/7/16.
 */
public class ThreeSortAlmostSorted {

    public static void sortAlmostSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            System.out.println("->" + minHeap.remove());
            minHeap.add(arr[i]);
        }
        while(!minHeap.isEmpty()) {
            System.out.println("->" + minHeap.remove());
        }
    }
}
