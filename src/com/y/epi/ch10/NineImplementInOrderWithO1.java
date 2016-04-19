package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 4/4/16.
 */
public class NineImplementInOrderWithO1 {

    public static void inorderTraversal(TreeNode<Integer> root){
        TreeNode<Integer> prev = null, next = null;
        TreeNode<Integer> curr = root;

        while(curr!=null){
            //Case 1: We came down from the prev node. Traverse the leftSubtree
            if(curr.parent == prev){
                if(curr.leftChild != null)
                    curr = curr.leftChild;
                else {
                    System.out.println(curr.data);
                    next = curr.rightChild != null ? curr.rightChild : curr.parent;
                }
            }
            //Case 2: We are coming up from leftChild.
            else if(curr.leftChild == prev){
                System.out.println(curr.data);
                next = curr.rightChild !=null ? curr.rightChild : curr.parent;
            }
            // Case 3: Coming up from rightChild
            else{
                next = curr.parent;
            }
            prev = curr;
            curr = next;
        }
    }
}
