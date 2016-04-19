package com.y.ctc.v5.ch2;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 12/28/15.
 */
public class Q3DeleteMiddle {

    public static Node deleteNode(Node node){
        Node current = node;
        Node runner = node.next;
        while(runner != null){
            current.data = runner.data;
            if(runner.next == null) {
                current.next = null;
                break;
            }
            else {
                current = current.next;
                runner = runner.next;
            }
        }
        return node;
    }
}
