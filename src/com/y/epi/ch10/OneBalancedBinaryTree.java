package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 2/1/16.
 */
public class OneBalancedBinaryTree {

    public static boolean checkBalancedTree(TreeNode node){
        if(node == null){
            return true;
        }
        return (Math.abs(height(node.leftChild) - height(node.rightChild)) <= 1) && checkBalancedTree(node.leftChild) && checkBalancedTree(node.rightChild);

    }

    public static int height(TreeNode node){
        if(node == null)
            return 0;
        else{
            return Math.max(1 + height(node.leftChild), 1 + height(node.rightChild));
        }
    }
}
