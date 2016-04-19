package com.y.ctc.v5.ch3;

/**
 * Created by akasha on 1/10/16.
 */
public class Q1StackThreeArrays {

    int stackSize = 0;
    static int[] array = new int[12];
    static int[] stackPtr = {0,4,8};

    public static void push(int stackNum, int value){
        if(stackPtr[stackNum] >= (stackNum + 1) * 4)
            return;
        else {
            array[stackPtr[stackNum]] = value;
            stackPtr[stackNum]++;
        }
    }

    public static int pop(int stackNum){
        if(stackPtr[stackNum]<= stackNum*4)
            return -1;
        else{
            stackPtr[stackNum]--;
            return array[stackPtr[stackNum]];
        }
    }
}
