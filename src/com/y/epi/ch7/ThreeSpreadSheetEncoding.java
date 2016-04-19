package com.y.epi.ch7;

/**
 * Created by akasha on 4/2/16.
 */
public class ThreeSpreadSheetEncoding {

    public static double returnEncoding(String string){
        int result = 0;
        for(int i = 0 ; i < string.length() ; i++){
            int charCount = string.charAt(i) - 'A' + 1;
            result = result * 26 + charCount;
        }
        return result;
    }
}
