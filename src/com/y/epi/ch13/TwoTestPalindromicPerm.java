package com.y.epi.ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by akasha on 2/7/16.
 */
public class TwoTestPalindromicPerm {

    public static boolean testPalindromicPerm(String str){
        boolean foundOdd = false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        ArrayList<Integer> it = (ArrayList)map.values();
        for(Integer i: it){
            if(i % 2 == 0){
                continue;
            }else{
                if(foundOdd)
                    return false;
                else{
                    foundOdd = true;
                }
            }
        }
        return true;
    }

}
