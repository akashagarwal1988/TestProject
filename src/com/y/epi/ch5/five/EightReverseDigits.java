package com.y.epi.ch5.five;

/**
 * Created by akasha on 2/6/16.
 */
public class EightReverseDigits {

    public static int reverseDigits(int num){
        boolean isNegative = num < 0 ? true : false;
        if(isNegative)
            num =  0 - num;
        int result = 0;
        while(num > 0){
            int digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }
        return isNegative ? (0 - result): result;
    }
}
