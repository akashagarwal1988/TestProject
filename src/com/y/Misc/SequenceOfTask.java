package com.y.Misc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by akasha on 2/27/16.
 */
public class SequenceOfTask {

    public static String returnOptimalSequence(String str, int coldTime) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else {
                map.put(c, map.get(c) + 1);
            }
        }
        String result = "";
        while (true) {
            System.out.println("Map " + map);
            int count = coldTime + 1;
            Iterator<Character> it = map.keySet().iterator();
            if (!it.hasNext()) {
                break;
            }
            while (it.hasNext()) {
                Character c = it.next();
                result = result + c;
                int value = map.get(c);
                if(value == 1){
                    it.remove();
                }else{
                    map.put(c, --value);
                }
                count--;
                System.out.println("Map inside " + map + " count " + count);
            }
            while(count>0){
                result = result + "_";
                count--;
            }
            System.out.println("Result " + result);
        }
    return result;
    }
}
