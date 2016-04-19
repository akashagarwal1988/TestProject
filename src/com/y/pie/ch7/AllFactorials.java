package com.y.pie.ch7;

/**
 * Created by akasha on 1/30/16.
 */
public class AllFactorials {

    public static int[] allFactorials(int n){
        int[] results = new int[n+1];
        allFactorialRec(n, results);
        return results;
    }

    public static int allFactorialRec(int n, int[] results){
        if(n==1){
            results[n] = 1;
            return 1;
        }else{
            int fact = n * allFactorialRec(n-1,results);
            results[n] = fact;
            return fact;
        }
    }
}
