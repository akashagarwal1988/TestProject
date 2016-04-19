package com.y.epi.ch7;

/**
 * Created by akasha on 2/11/16.
 */
public class EightLookAndSay {

    public static String lookAndSay(int n) {
        String lastNum = "1";
        if (n == 1)
            return lastNum;
        else {
            String nextNum = "";
            for (int i = 2; i <= n; i++) {
                int count = 1;
                int j = 1;
                nextNum = "";
                while (j < lastNum.length()) {
                    if (lastNum.charAt(j) == lastNum.charAt(j - 1)) {
                        count++;
                    } else {
                        nextNum = nextNum + count + lastNum.charAt(j - 1);
                        count = 1;
                    }
                    j++;

                }
                nextNum = nextNum + count + lastNum.charAt(j - 1);
                lastNum = nextNum;
            }
            return nextNum;
        }
    }
}
