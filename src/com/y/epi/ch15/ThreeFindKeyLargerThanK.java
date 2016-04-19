package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 2/6/16.
 */
public class ThreeFindKeyLargerThanK {

    static int preval = Integer.MIN_VALUE;
    static int result = -1;
    public static int findFirstKeyGreaterThanK(TreeNode<Integer> root, double k){
        if(root == null)
            return result;
        else{
            findFirstKeyGreaterThanK(root.leftChild, k);
            if(preval < k && root.data >= k){
                result = root.data;
            }
            preval = root.data;
            findFirstKeyGreaterThanK(root.rightChild, k);
            return result;
        }
    }

    public static int findFirstKeyGreaterTHankBinarySearch(TreeNode<Integer> root, double k){
        int firstSoFar = -1;
        while(root!=null){
            if(root.data >= k){
                firstSoFar = root.data;
                root = root.leftChild;
            }else{
                root = root.rightChild;
            }
        }
        return firstSoFar;
    }

}
