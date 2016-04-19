package com.y.epi.ch9;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 2/11/16.
 */
public class ElevenImplementEvenOddMerge {

    public static Node evenOddMerge(Node head) {
        if (head == null) {
            return null;
        }
        Node evenHead = head;
        Node oddHead = head.next;
        Node currEven = evenHead;
        Node currOdd = oddHead;
        while (currOdd != null) {
            currEven.next = currOdd.next;
            if(currEven.next != null)
                currEven = currEven.next;
            if (currEven != null) {
                currOdd.next = currEven.next;
                currOdd = currOdd.next;
            }
        }
        currEven.next = oddHead;
        return evenHead;
    }
}
