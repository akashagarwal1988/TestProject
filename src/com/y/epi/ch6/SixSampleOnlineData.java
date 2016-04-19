package com.y.epi.ch6;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by akasha on 2/4/16.
 */
public class SixSampleOnlineData {

    public static List<Integer> returnSubset(List<Integer> arr, int k){
        Random gen = new Random();
        for(int i = 0;i < k; i++){
           Collections.swap(arr, i, i + gen.nextInt(arr.size() - i - 1));
        }
        return arr.subList(0,k);
    }
}
