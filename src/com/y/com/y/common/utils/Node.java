package com.y.com.y.common.utils;

/**
 * Created by akasha on 12/28/15.
 */
public class Node {

    public int data;
    public Node next;

    public Node(){

    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    // copy constructor for a Node object (does deep copy)
    public Node (Node node){
        Node current = node;
        Node newNode = this;
        newNode.data = node.data;
        Node temp;
        current = current.next;
        while(current != null) {
            temp = new Node();
            temp.data = current.data;
            newNode.next = temp;
            newNode = temp;
            current = current.next;
        }
    }

    public static void printLL(Node root){
         Node current = root;
         while(current!=null){
             System.out.println(current.data + " -> ");
             current = current.next;
         }
     }
}
