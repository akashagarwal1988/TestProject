package com.y.epi.ch5.five;

/**
 * Created by akasha on 12/13/15.
 */
public class Seven {

    public static double computeXy(double x, int y) {
        double result = 1.0;

        if (y < 0) {
            y = 0 - y;
            x = 1.0 / x;
        }
        while (y > 0) {
            if ((y & 1) != 0) {
                result = result * x;
            }
            x *= x;
            y = y >>> 1;
        }
        return result;
    }
}
