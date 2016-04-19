package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 4/3/16.
 */
public class FiveComputeSumOfBinary {


    public static int calculateSum(TreeNode<Integer> root){
        Integer sum = 0;
        if(root == null)
            return sum;
        return calculateRecursively(root, 0);
    }

    public static int calculateRecursively(TreeNode<Integer> root, int curr){
        curr = (curr << 1) + root.data;
        if(root.leftChild == null && root.rightChild == null) {
            return curr;
        }
        return ((root.leftChild != null ? calculateRecursively(root.leftChild, curr) : 0) + (root.rightChild != null ? calculateRecursively(root.rightChild, curr) : 0));

    }
}
