package com.y.epi.ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by akasha on 3/6/16.
 */
public class SevenFindClosestKEntries {

    public static List<Integer> findkClosestEntries(List<List<Integer>> list){
        int k = list.size();

        List<Integer> currIndexes = new ArrayList<Integer>();
        for(int i = 0; i <  list.size(); i++)
            currIndexes.add(0);
        TreeSet<ArrayData> set = new TreeSet<ArrayData>();
        for(int i = 0; i <  list.size(); i++){
            set.add(new ArrayData(i, list.get(i).get(0)));
        }
        int diff = Integer.MAX_VALUE;
        List<Integer> resultList = null;
        while(true){
            int currDiff = set.last().value - set.first().value;
            if(currDiff < diff){
                resultList = getResultList(currIndexes, list);
                diff = currDiff;
            }
            int minIndex = set.first().idx;
            currIndexes.set(minIndex, currIndexes.get(minIndex) + 1);
            if(currIndexes.get(minIndex) >= list.get(minIndex).size()){
                break;
            }
            set.pollFirst();
            set.add(new ArrayData(minIndex, list.get(minIndex).get(currIndexes.get(minIndex))));

        }
        return resultList;
    }

    public static List<Integer> getResultList(List<Integer> currIndexes, List<List<Integer>> list){
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < currIndexes.size(); i++){
            int currIndex = currIndexes.get(i);
            result.add(list.get(i).get(currIndex));
        }
        return result;

    }
}

class ArrayData implements Comparable<ArrayData>{
    Integer idx;
    Integer value;

    @Override
    public int compareTo(ArrayData o ){
        return this.value.compareTo(o.value);
    }

    public ArrayData(int idx, int value){
        this.idx = idx;
        this.value = value;
    }



}
