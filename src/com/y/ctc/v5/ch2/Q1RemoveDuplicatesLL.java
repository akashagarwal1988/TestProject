package com.y.ctc.v5.ch2;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 12/28/15.
 */
public class Q1RemoveDuplicatesLL {

    public static Node removeDups(Node root){
        if(root == null || root.next == null)
            return root;

        Node current = root;

        while(current != null){
            Node prev = current;
            Node runner = current.next;
            while(runner != null){
                if(current.data == runner.data){
                    prev.next = runner.next;
                }
                prev = prev.next;
                runner = runner.next;
            }
        current = current.next;

        }
        return root;
    }
}
