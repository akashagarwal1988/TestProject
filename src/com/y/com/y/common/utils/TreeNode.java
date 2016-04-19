package com.y.com.y.common.utils;

/**
 * Created by akasha on 1/22/16.
 */
public class TreeNode<T> {

    public T data;
    public TreeNode leftChild;
    public TreeNode rightChild;
    public TreeNode next;
    public int countChild;

    public TreeNode parent;

    public TreeNode(T data){
        this.data = data;
    }

    public TreeNode(T data, int count){
        this.data = data;
        this.countChild = count;
    }

    public TreeNode(T data, int count, TreeNode parent){
        this.data = data;
        this.countChild = count;
        this.parent = parent;
    }

    public void printInOrder(TreeNode node){

    }
}


