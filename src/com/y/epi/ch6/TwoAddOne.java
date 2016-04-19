package com.y.epi.ch6;

import java.util.List;

/**
 * Created by akasha on 2/6/16.
 */
public class TwoAddOne {

    public static List<Integer> addOne(List<Integer> list){
        int carry = 1;
        for(int i = list.size() - 1; i >= 0; i--){
            if(carry == 0)
                break;
            int num = list.get(i);
            num = num + carry;
            int rem ;
            if(num>=10){
                rem = num %10;
            }else{
                rem = num;
            }
            carry = num / 10;
            list.remove(i);
            list.add(i,rem);
        }
        if(carry==1)
            list.add(0,1);
        return list;
    }

}
