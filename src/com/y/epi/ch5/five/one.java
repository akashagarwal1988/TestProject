package com.y.epi.ch5.five;

import com.y.com.y.common.utils.Helper;

/**
 * Created by akasha on 12/13/15.
 */
public class one {


    public static int computeParityFirst(int number) {
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number = number >> 1;
        }
        return count;
    }

    public static int computeParitySecond(int number) {
        int count = 0;
        System.out.println("Number " + Helper.printBinary(number));
        while (number > 0) {
            count++;
            number = number & (number - 1);
            System.out.println("Number " + Helper.printBinary(number));
        }
        return count;
    }


}
