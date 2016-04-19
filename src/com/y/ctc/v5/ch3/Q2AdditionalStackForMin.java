package com.y.ctc.v5.ch3;

import java.util.Stack;

/**
 * Created by akasha on 1/10/16.
 */
public class Q2AdditionalStackForMin extends Stack<Integer>{
    public static Stack<Integer> minStack;

    public void push (int value){
        if(minStack.peek() > value){
            minStack.push(value);
        }
        super.push(value);
    }

    public Integer pop(){
        if(minStack.peek()==super.peek()){
            minStack.pop();
        }
        return super.pop();
    }

    public Integer min(){
        return minStack.peek();
    }
}
