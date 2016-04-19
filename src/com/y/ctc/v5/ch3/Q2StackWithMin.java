package com.y.ctc.v5.ch3;

import java.util.Stack;

/**
 * Created by akasha on 1/10/16.
 */
public class Q2StackWithMin extends Stack<NodeWithMin> {


    public void push(int value) {
        int min = Math.min(value, this.peek().min);
        push(new NodeWithMin(value, min));
    }

    public NodeWithMin pop() {
        return super.pop();
    }

    public int min() {
        if (this.isEmpty())
            return Integer.MAX_VALUE;
        else
            return peek().min;
    }
}


class NodeWithMin {
    int data;
    int min;

    public NodeWithMin(int data, int min) {
        this.data = data;
        this.min = min;
    }
}

