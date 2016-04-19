package com.y.epi.ch13;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by akasha on 2/21/16.
 */
public class ElevenLengthOfLongestContainedInterval {

    public static int returnLengthOfLongestInterval(Integer[] arr){

        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

        int longestInterval = 0;
        while(!set.isEmpty()){
            int num = set.iterator().next();
            int lowerBound = 0;
            int upperBound = 0;
            if(set.contains(num)){
                int tmp = num;
                while(set.contains(--tmp)){
                    ++lowerBound;
                    set.remove(tmp);
                }
                tmp = num;
                while(set.contains(++tmp)) {
                    ++upperBound;
                    set.remove(tmp);
                }
                set.remove(num);
                longestInterval = Math.max(lowerBound + upperBound + 1, longestInterval);
            }else{
                continue;
            }
        }
        return longestInterval;
    }

}
