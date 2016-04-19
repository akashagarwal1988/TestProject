package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 4/3/16.
 */
public class SixRootToLeafPathWithSum {

    public static boolean existsRootToLeafPath(TreeNode<Integer> root, int sum){
        if(root == null && sum == 0)
            return true;
        else if(root == null)
            return false;
        return helper(root, 0, sum);
    }

    public static boolean helper(TreeNode<Integer> root, int curr, int sum){
        //helper will be called only for non null roots , If curr == sum for leaf then return true;
        curr += root.data;
        if(root.leftChild == null && root.rightChild == null){
            if(curr == sum)
                return true;
            else
                return false;
        }
        boolean leftTreeStatus = helper(root.leftChild, curr, sum);
        if(leftTreeStatus){
            return true;
        }
        boolean rightTreeStatus = helper(root.rightChild, curr, sum);
        if(rightTreeStatus){
            return true;
        }
        return false;


    }
}
