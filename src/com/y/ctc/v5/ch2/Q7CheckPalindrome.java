package com.y.ctc.v5.ch2;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 12/28/15.
 */
public class Q7CheckPalindrome {

    public static boolean checkPalindromeByReversing(Node node) {
        Node newNode = new Node(node);
        Node.printLL(node);
        System.out.println("Reversing a linked list");
        Node reverse = recReverse(newNode);
        Node.printLL(reverse);
        System.out.println("after node");
        Node.printLL(node);
        while (reverse != null && node != null) {
            if (reverse.data != node.data)
                return false;
            reverse = reverse.next;
            node = node.next;
        }
        return true;
    }

    public static Node recReverse(Node node) {
        if(node == null)
            return node;
        if(node.next == null)
            return node;
        else{
            Node second = node.next;
            node.next = null;
            Node revList = recReverse(second);
            second.next = node;
            return revList;
        }
    }

    public static Node iterReverse(Node node) {
        Node current = node;
        Node temp = current;
        Node head = temp;
        if (current != null) {
            current = current.next;
            head.next = null;
        }

        while (current != null) {
            temp = current;
            current = current.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}
