package com.y.epi.ch6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 3/31/16.
 */
public class ThreeMultiplyTwoNumbers {

    public static List<Integer> multiplyTwoNumbers(int[] num1, int[] num2) {
        int count = 0;
        List<Integer> result = new ArrayList<Integer>();
        for (int i = num1.length - 1; i >= 0; i--) {
            List<Integer> list = new ArrayList();
            int carry = 0;
            int k = 0;
            while (k < count) {
                list.add(0, 0);
                k++;
            }
            for (int j = num2.length - 1; j >= 0; j--) {
                int num = num2[j] * num1[i] + carry;
                carry = num > 10 ? num / 10 : 0;
                num = num > 10 ? num % 10 : num;
                list.add(0, num);
            }
            count++;
            if (carry > 0)
                list.add(0, carry);

            if (result.size() == 0) {
                result = list;
            } else {
                List<Integer> tmpResult = new ArrayList<Integer>();
                int car = 0;
                int l = list.size() - 1;
                int m = result.size() - 1;
                while (l >= 0 && m >= 0) {
                    int sum = list.get(l--) + result.get(m--) + car;
                    car = sum > 10 ? sum / 10 : 0;
                    sum = sum > 10 ? sum % 10 : sum;
                    tmpResult.add(0, sum);
                }
                while(l>=0){
                    int sum = list.get(l--) + car;
                    car = sum > 10 ? sum / 10 : 0;
                    sum = sum > 10 ? sum % 10 : sum;
                    tmpResult.add(0, sum);
                }
                while(m>=0){
                    int sum = list.get(m--) + car;
                    car = sum > 10 ? sum / 10 : 0;
                    sum = sum > 10 ? sum % 10 : sum;
                    tmpResult.add(0, sum);
                }
                if (car > 0)
                    tmpResult.add(0, car);
                result = tmpResult;
            }
        }
        return result;
    }
}
