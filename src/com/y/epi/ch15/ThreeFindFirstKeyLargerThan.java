package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 3/6/16.
 */
public class ThreeFindFirstKeyLargerThan {

    public TreeNode findFirstLargerThan(TreeNode<Integer> root, int val){
        TreeNode<Integer> curr = root;
        TreeNode<Integer> result = null;
        while(curr!=null){
            if(curr.data > val){
                result = curr;
                curr = curr.leftChild;
            }else if(curr.data <= val){
                curr = curr.rightChild;
            }
        }
        return result;
    }
}
