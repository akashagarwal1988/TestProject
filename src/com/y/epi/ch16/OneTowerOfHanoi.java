package com.y.epi.ch16;

/**
 * Created by akasha on 2/2/16.
 */
public class OneTowerOfHanoi {

    static String result = "";

    public static String moveRings(String origin, String buffer, String destination, int n){
        if(n <= 0){
            return result;
        }
        if(n == 1){
            result += " -> \n" + makeMessage(origin, destination, n)  ;
        }else{

            moveRings(origin, destination, buffer,n - 1);
            result += " -> \n" + makeMessage(origin, destination, n)  ;
            moveRings(buffer, origin, destination, n - 1);
        }
        return result;
    }

    public static String makeMessage(String origin, String destination, int n){
        return "Moving " + n + " ring from " + origin + " to " + destination;
    }
}
