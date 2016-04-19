package com.y.pie.ch7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 1/30/16.
 */
public class CombinationOfString {

    public static List<String> combinationOfStrings(String str){

        if(str == null || str.length()==0){
            return new ArrayList<String>();
        }
        char c = str.charAt(0);
        List<String> combinations = combinationOfStrings(str.substring(1));
        List<String> nextSet = new ArrayList<String>();
        nextSet.add(c + "");
        for(String comb: combinations){
            nextSet.add(comb + c);
        }
        nextSet.addAll(combinations);
        return nextSet;
    }
}
