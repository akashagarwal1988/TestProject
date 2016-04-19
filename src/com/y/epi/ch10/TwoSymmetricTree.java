package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 2/7/16.
 */
public class TwoSymmetricTree {

    public static boolean checkSymmetric(TreeNode<Integer> root){
        if(root == null)
            return true;
        else return checkSymmetricTree(root.leftChild, root.rightChild);
    }

    public static boolean checkSymmetricTree(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1==null && root2 == null)
            return true;
        else if(root1==null || root2 == null)
            return false;
       return root1.data == root2.data && checkSymmetricTree(root1.leftChild, root2.rightChild) && checkSymmetricTree(root1.rightChild, root2.leftChild);

    }


}
