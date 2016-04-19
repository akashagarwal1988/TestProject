package com.y.epi.ch17;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 3/7/16.
 */
public class EightFindMinimumWeight {

    public static int findMinimumWeight(List<List<Integer>> triangle) {
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(triangle.get(0).get(0));
        List<Integer> tmp = new ArrayList();
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int num = 0;
                if (j == 0 || j == triangle.size() - 1) {
                    num = prev.get(j) + triangle.get(i).get(j);
                } else {
                    num = Math.min(prev.get(j-1), prev.get(j)) + triangle.get(i).get(j);
                }
                tmp.add(num);
            }
            prev = tmp;
        }
        int min = prev.get(0);

        for(int num : prev){
            min = Math.min(min, num);
        }

        return min;
    }
}
