package com.y.epi.ch7;

import java.util.ArrayList;
import java.util.List;

public class TenGenerateIPPerms
{
    public List<String> restoreIpAddresses(String s) {

        // Get a prefix, check if its valid and continue for the rest of the string.
        List<String> result = new ArrayList();
        char[] charArr = new char[s.length() + 3];
        restoreRecursively(s, result, 0, 3, charArr, 0);
        return result;

    }

    public void restoreRecursively(String s, List<String> result, int idx, int dots, char[] currString, int currIdx){
        //base case, if dots remaining is 0 and the last part of string is valid
        if(dots == 0 && isValid(s.substring(idx, s.length()))){
            for(char c: s.substring(idx, s.length()).toCharArray()){
                currString[currIdx++] = c;
            }
            result.add(new String(currString));
            return;
        }
        // Get prefix, check recursively for substrings
        if(dots > 0){
            for(int i = idx; i < idx + 3 && i < s.length(); i++){
                String prefix = s.substring(idx, i+1);
                if(isValid(prefix)){
                    int lastIdx = currIdx;
                    for(char c: prefix.toCharArray()){
                        currString[currIdx++] = c;
                    }
                    currString[currIdx++] = '.';
                    restoreRecursively(s, result, i + 1, dots - 1, currString, currIdx);
                    currIdx = lastIdx;
                }
            }
        }

    }

    public boolean isValid(String string){
        try{
            int num = Integer.parseInt(string);
            if(num <=255 && num >= 0)
                return true;
                //put more conditions here for accepted answer.
            else
                return false;
        }catch(Exception e){
            return false;
        }
    }
}