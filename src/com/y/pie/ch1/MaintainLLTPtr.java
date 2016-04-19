package com.y.pie.ch1;

import com.y.com.y.common.utils.Node;

/**
 * Created by akasha on 1/28/16.
 */
public class MaintainLLTPtr {

     public Node head;

     public boolean removeNode(Node node){
        if(head == null){
            return false;
        }
        if(node == head){
            Node curr = head;
            curr.next = null;
            node = node.next;
            return true;
        }else{
            Node curr = head.next;
            Node prev = head;
            while(curr != null){
                if(node == curr){
                    prev.next = curr.next;
                    return true;
                }
                curr = curr.next;
                prev = prev.next;
            }
            return false;
        }
    }

    public boolean insertAfter(Node node, int data){
        Node newNode = new Node(data);
        if(node == null){
            newNode.next = node;
            node = newNode;
            return true;
        }else{
            Node curr = head;
            while(curr!=null){
                if(curr == node){
                    newNode.next = curr.next;
                    curr.next = newNode;
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }
    }

    public MaintainLLTPtr(Node head){
        this.head = head;
    }


}
