package com.y.pie.ch7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 1/30/16.
 */
public class PermutationOfString {

    public static List<String> permString(String str){
        return permStringRec(str);
    }

    public static List<String> permStringRec(String string){
        if(string == null || string.equals("")) {
            List<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char c = string.charAt(0);
        List<String> perms = permStringRec(string.substring(1));

        List<String> nextSet = new ArrayList<String>();
        for(String str: perms){
            nextSet.addAll(insertChar(c, str));
        }
        System.out.println("perms " + perms + " c " + c + " nextSet " + nextSet);
        return nextSet;
    }

    public static List<String> insertChar(char c, String str){
        List<String> list = new ArrayList<String>();
        if(str.length() == 0){
            list.add(c + "");
            return list;
        }
        for(int i =0;i<=str.length();i++){
            String newString = str.substring(0,i) + c + str.substring(i);
            list.add(newString);
        }
        return list;
    }
}
