package com.y.epi.ch12;

/**
 * Created by akasha on 2/7/16.
 */
public class FourSearchCyclicSortedArray {

    public static int searchCyclicSortedArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        return binarySearchCyclic(arr, low, high);
    }

    private static int binarySearchCyclic(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        } else if (arr[low] <= arr[mid] && arr[high] < arr[low]) {
            return binarySearchCyclic(arr, mid + 1, high);
        } else if (arr[low] <= arr[mid] && arr[high] > arr[low]) {
            return arr[low];
        } else {
            return binarySearchCyclic(arr, low, mid - 1);
        }
    }
}
