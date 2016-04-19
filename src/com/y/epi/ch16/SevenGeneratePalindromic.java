package com.y.epi.ch16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 3/7/16.
 */
public class SevenGeneratePalindromic {

    public static List<List<String>> generatePalindromic(String string){
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> currList = new ArrayList<String>();
        generateRecPalindrome(string, 0 , currList, result);
        return result;
    }

    public static void generateRecPalindrome(String string, int idx, List<String> currList, List<List<String>> result){
        if(idx == string.length()){
            result.add(new ArrayList<String>(currList));
            return;
        }
        for(int i = idx; i < string.length(); i++){
            String prefix = string.substring(idx, i + 1);
            if(isPalindrome(prefix)){
                currList.add(prefix);
                generateRecPalindrome(string, i + 1, currList, result);
                currList.remove(currList.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String string){
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != string.charAt(string.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
