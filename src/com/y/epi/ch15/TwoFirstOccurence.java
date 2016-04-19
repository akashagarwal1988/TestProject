package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 3/6/16.
 */
public class TwoFirstOccurence {

    public TreeNode<Integer> returnFirstOccurence(TreeNode<Integer> root, int val){
        TreeNode curr = root;
        TreeNode result = null;
        while(curr!=null){
            if((Integer)curr.data == val){
                result = curr;
                curr = curr.leftChild;
            }
            if((Integer)curr.data > val){
                curr = curr.leftChild;
            }else{
                curr = curr.rightChild;
            }
        }
        return result;
    }
}
