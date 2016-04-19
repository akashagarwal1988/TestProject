package com.y.ctc.v5.ch1;

import java.util.Arrays;

/**
 * Created by akasha on 12/20/15.
 */
public class Q3StringPermutation {

    // O(nlog n) complexity as sort method is used.
    public static boolean ifPermutation(String str1, String str2){
        return (sort(str1).equals(sort(str2)));
    }

    public static boolean ifPermutationOn(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int [] arr = new int[256];
        for(Character c: str1.toCharArray()){
            arr[c]++;
        }
        for(Character c: str2.toCharArray()){
            arr[c]--;
        }
        for(int a: arr){
            if(a!=0)
                return false;
        }
        return true;
    }



    private static String sort(String str){
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

}
