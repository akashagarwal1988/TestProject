package com.y.epi.ch6;

import java.util.*;

/**
 * Created by akasha on 2/21/16.
 */
public class FifteenComputeRandomSubset {

   //TODO : Incomplete - buggy code

    public static List<Integer> randomSubset(int n, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Random nextGen = new Random();
        for (int i = 0; i < k; i++) {
            int randomInt = i + nextGen.nextInt(n - i);
            System.out.println("randomInt = " + randomInt);
            if (!map.containsKey(randomInt)) {
                map.put(randomInt, i);
                map.put(i, randomInt);
            } else {
                int tmp = map.get(randomInt);
                map.put(i, tmp);
                map.put(randomInt, i);
            }
            System.out.println("Map " + map);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            result.add(map.get(i));
        }
        return result;
    }
}
