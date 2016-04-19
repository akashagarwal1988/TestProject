package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 4/4/16.
 */
public class EightComputeSuccessor {

    public TreeNode findSuccessor(TreeNode node){
        TreeNode curr = node;
        //Case 1: node has a rightchild;
        if(curr.rightChild != null) {
            while(curr.leftChild!=null){
                curr = curr.leftChild;
            }
            return curr;
        }
        //Case 2: node is a leftChild of its parent.
        if(curr.parent!= null && curr.parent.leftChild == curr)
            return curr.parent;

        // Case 3: node is a rightChild of its parent
        while((curr.parent != null && curr.parent.rightChild == curr){
            curr = curr.parent;
        }
        if(curr.parent!=null){
            return curr.parent;
        }
        return null;

    }
}
