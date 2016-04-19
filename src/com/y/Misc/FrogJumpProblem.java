package com.y.Misc;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by akasha on 2/18/16.
 */
public class FrogJumpProblem {

    public static int returnMinimumNumberOfTimeTaken(int[] arr, int K, int D) {
        int maxReachable = D;
        // The treeset is used to maintain the positions of leaf which are not currently reachable by maxReachable point.
        // We keep the order in reverse because we want to reach the farthest leaf.
        TreeSet<Integer> leafPositisons = new TreeSet<Integer>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            //Checking if we can reach arr[i] from maxReachable
            if (arr[i] <= maxReachable) {
                //First we calculate whether the current leaf position enhances our maxReachable leaf position.
                maxReachable = Math.max(maxReachable, arr[i] + D);
                Iterator<Integer> it = leafPositisons.iterator();
                while (it.hasNext()) {
                    int maxLeafPosition = it.next();
                    if (maxLeafPosition <= maxReachable + D) {
                        maxReachable = maxLeafPosition + D;
                        break;
                    }
                }
            } else {
                leafPositisons.add(arr[i]);
            }
            if (maxReachable >= K) {
                return i;
            }
        }
        return -1;
    }
}
