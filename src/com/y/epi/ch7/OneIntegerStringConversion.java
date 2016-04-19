package com.y.epi.ch7;

/**
 * Created by akasha on 1/30/16.
 */
public class OneIntegerStringConversion {

    public static Integer stringToInt(String string){

        int num = 0;
        boolean isNegative = false;
        for(int i = 0; i < string.length(); i++){
            if(i == 0 && string.charAt(i) == '-'){
                isNegative = true;
                continue;
            }
            num = num * 10 + (string.charAt(i) - '0');
        }
        if(isNegative)
            num = 0 - num;
        return num;
    }

    public static String IntegerToString(Integer num){
        boolean isNegative = false;
        if(num < 0){
            isNegative = true;
            num = 0 - num;
        }
        String str = "";
        while(num > 0){
            int rem = num % 10;
            str = rem + str;
            num = num / 10;
        }
        if(isNegative)
            str = "-" + str;
        return str;
    }
}
