package com.y.epi.ch8;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 4/10/16.
 */
public class ThreeReverseSubList {

    public Node reverseSubList(Node head, int start, int end){
        int k = 1;
        Node prev = null;
        Node curr = head;
        while(k<start && curr!=null){
            prev = curr;
            curr = curr.next;
            k++;
        }
        Node subListHead = prev;
        prev = curr;
        curr = curr.next;
        Node tail = prev;
        while(curr!=null && k < end){
            Node next = curr.next;
            tail.next = next.next;
            curr.next = prev;
        }
    }
}
