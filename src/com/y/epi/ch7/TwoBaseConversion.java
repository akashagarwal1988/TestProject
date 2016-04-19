package com.y.epi.ch7;

/**
 * Created by akasha on 2/4/16.
 */
public class TwoBaseConversion {

    public static String convertBase(String str, int b1, int b2) {
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }
        int num = 0, k = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int tmp = Character.isDigit(str.charAt(i)) ? str.charAt(i) - '0' : str.charAt(i) - 'A' + 10;
            num = num + (int) (tmp * Math.pow(b1, k++));
        }
        String result = "";
        while (num > 0) {

            int tmp = num % b2;
            System.out.printf("tmp " + tmp);
            char ch = tmp >= 10 ? (char) ('A' + tmp - 10) : (char)('0' + tmp);
            result = ch + result;
            num = num / b2;
        }
        if (isNegative)
            result = "-" + result;
        return result;
    }
}
