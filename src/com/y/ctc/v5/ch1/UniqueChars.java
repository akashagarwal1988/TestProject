package com.y.ctc.v5.ch1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by akasha on 12/20/15.
 */
public class UniqueChars {

    public static boolean ifUniqueOne(String str){
        Map<Character,Integer> map = new HashMap();
        for(Character c: str.toCharArray()){
            if(map.containsKey(c)){
                return false;
            }
            map.put(c,1);
        }
        return true;
    }

    public static boolean ifUniqueWithoutDataStructure(String str){
        int num = 0;
        for(Character c: str.toCharArray()){
            int shiftNum = 1 << (c - 'a');
            if(((num >> (c -'a')) & 1) == 1)
                return false;
            num = num | shiftNum;
        }
        return true;
    }
}
