package com.y.ctc.v5.ch2;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 12/28/15.
 */
public class Q2FindKthLast {

    public static int findKthLast(Node root, int k){
        Node current = root;
        Node runner = current;
        for( int i = 0; i < k; i++ ){
            if(runner != null){
                runner = runner.next;
            }
            else{
                return -1;
            }
        }
        while(runner != null){
            current = current.next;
            runner = runner.next;
        }
        return current.data;
    }

}
