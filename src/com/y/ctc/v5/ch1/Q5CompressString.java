package com.y.ctc.v5.ch1;

/**
 * Created by akasha on 12/27/15.
 */
public class Q5CompressString {

    public static String compressString(String str){

        String result = "";
        char c = str.charAt(0);
        result = result + c;
        int count = 1;
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }else{
                c = str.charAt(i);
                result = result + count + c;
                count = 1;
            }
        }
        result = result + count;
        if(result.length() >= str.length())
            return str;
        else
            return result;

    }
}
