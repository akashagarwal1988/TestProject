package com.y.epi.ch8;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 4/10/16.
 */
public class ReverseLL {

    public Node reverseLinkedList(Node head){

        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
