package com.y.epi.ch7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by akasha on 2/21/16.
 */
public class NineConvertRomanToDecimal {

    Map<Character, Integer> map = new HashMap<Character, Integer>();

    public int convertRomanToDecimal(String roman) {
        int result = 0;
        while (roman.length() > 0) {
            String sub = "";
            if (roman.length() >= 2) {
                sub = roman.substring(roman.length() - 2);
                int number = map.get(sub.charAt(0)) > map.get(sub.charAt(1)) ? map.get(sub.charAt(0)) + map.get(sub.charAt(1)) : map.get(sub.charAt(1)) - map.get(sub.charAt(0));
                result = result + number;
                roman = roman.substring(0,roman.length() - 2);
            } else {
                result = result + map.get(roman.charAt(0));
                roman = "";
            }

        }
        return result;
    }

    public NineConvertRomanToDecimal() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}
