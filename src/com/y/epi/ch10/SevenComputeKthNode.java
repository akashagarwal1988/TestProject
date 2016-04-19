package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 4/4/16.
 */
public class SevenComputeKthNode {

    public static TreeNode<Integer> returnKthNode(TreeNode<Integer> root, int k) {
        TreeNode curr = root;
        while(curr != null){
            //Case 1 : LeftNode contains k elements

            if(curr.leftChild.countChild == k -1)
                return curr;
            //Case 2 : Left Node contains less elements than k
            else if(curr.leftChild.countChild < k -1 ){
                curr = curr.rightChild;
                k = k - (curr.leftChild.countChild + 1);
            }else {
                curr = curr.leftChild;
            }
        }
        return null;

    }
}
