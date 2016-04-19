package com.y.epi.ch16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 3/7/16.
 */
public class FiveGenerateSubsetsOfSizeK {

    public static List<List<Integer>> returnSubsetsOfSizeK(List<Integer> list, int k){
        List<List<Integer>> result = new ArrayList();
        if(k > list.size()){
            return null;
        }else if(k == list.size()){
            result.add(list);
            return result;
        }else{
            List<Integer> currList = new ArrayList<Integer>();
            recurseSubsetsOfSizeK(list, k, currList, result, 0);
        }
        return result;
    }

    public static void recurseSubsetsOfSizeK(List<Integer> list, int k, List<Integer> currList , List<List<Integer>> result, int count){
        if(currList.size() == k){
            result.add(new ArrayList<Integer>(currList));
            return;
        }

        for(int i = count; i < list.size(); i++){
            Integer number = list.get(i);
            currList.add(number);
            recurseSubsetsOfSizeK(list, k, currList, result, i + 1);
            currList.remove(currList.size()-1);
        }
    }
}
