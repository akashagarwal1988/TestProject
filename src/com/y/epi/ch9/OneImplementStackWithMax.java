package com.y.epi.ch9;

import java.util.Stack;

/**
 * Created by akasha on 3/5/16.
 */
public class OneImplementStackWithMax {

    StackWithMax s;

    public OneImplementStackWithMax(){
        s = new StackWithMax();
    }

    public int push(Integer item){
       return s.push(item);
    }

    public int pop(){
        return s.pop();
    }

    public int max(){
        return s.max();
    }

}

class StackWithMax extends Stack<Integer> {
    Stack<Integer> maxStack;

    public StackWithMax(){
        maxStack = new Stack<Integer>();
    }

    @Override
    public Integer push(Integer item) {
        if(maxStack.isEmpty()){
            maxStack.push(item);
        }
        else if(item >= maxStack.peek()){
            maxStack.push(item);
        }

        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        Integer top =  super.pop();
        if(maxStack.peek() == top){
            maxStack.pop();
        }
        return top;
    }

    public int max(){
        return maxStack.peek();
    }
}
