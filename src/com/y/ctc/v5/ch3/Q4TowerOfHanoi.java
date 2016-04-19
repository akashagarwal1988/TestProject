package com.y.ctc.v5.ch3;

import java.util.Stack;

/**
 * Created by akasha on 1/10/16.
 */
public class Q4TowerOfHanoi {

    int N;
    Stack<Integer>[] stacks = new Stack[3];

    public Q4TowerOfHanoi(int N) {
        for (int i = N; i >=1; i--) {
            this.stacks[0].push(i);
        }
    }

    public boolean checkIfWon(){
        if(stacks[2].size() == N)
            return true;
        else
            return false;
    }

    public void playChance(){
        for(int i = 0;i<2;i++){
            if((stacks[i].size() > 0 && stacks[i].peek() < stacks[i+1].peek()) || stacks[i+1].size() == 0){
                int value = stacks[i].pop();
                stacks[i+1].push(value);
                return;
            }else if(stacks[i].size() > 0 && stacks[i].peek() <  stacks[i+1].peek()){

            }

        }
    }
}
