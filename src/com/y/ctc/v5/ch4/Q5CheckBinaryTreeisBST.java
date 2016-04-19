package com.y.ctc.v5.ch4;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 1/22/16.
 */
public class Q5CheckBinaryTreeisBST {

    static Integer val = Integer.MIN_VALUE;
    public static boolean checkBST(TreeNode node){

        return checkBSTrec(node);

    }

    public static boolean checkBSTrec(TreeNode<Integer> node){
        if(node == null){
            return true;
        }
        checkBSTrec(node.leftChild);
        int data = node.data;
        System.out.println("data " + data + " val " + val);
        if(data < val){
            System.out.println("inside if");
            return false;
        }else{
            val = node.data;
            System.out.println("inside else");
            return true && checkBSTrec(node.rightChild);
        }

    }
}
