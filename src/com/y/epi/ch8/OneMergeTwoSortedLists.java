package com.y.epi.ch8;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 3/5/16.
 */
public class OneMergeTwoSortedLists {

    public Node mergeTwoSortedLists(Node n1, Node n2) {
        Node dummyResult = new Node(-1);
        Node curr1 = n1;
        Node curr2 = n2;
        Node resultCurr = dummyResult;
        while (curr1 != null && curr2 != null) {
            if (curr1.data <= curr2.data) {
                resultCurr.next = curr1;
                curr1 = curr1.next;
            } else {
                resultCurr.next = curr2;
                curr2 = curr2.next;
            }
            resultCurr = resultCurr.next;
        }
        resultCurr.next = curr1 == null ? curr2: curr1;
        return dummyResult.next;
    }
}
