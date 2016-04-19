package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 3/8/16.
 */
public class ThirteenFindInRange {

    public List<TreeNode> findInRange(TreeNode root, int start, int end){
        List<TreeNode> result = new ArrayList<TreeNode>();
        recurseFindInRange(root, start, end, result);
        return result;
    }

    public void recurseFindInRange(TreeNode<Integer> root, int start, int end, List<TreeNode> result){
        if(root == null){
            return;
        }
        else if(root.data < end && root.data > start){
            recurseFindInRange(root.leftChild, start, end, result);
            result.add(root);
            recurseFindInRange(root.leftChild, start, end, result);
        }else{
            if(root.data > end){
                recurseFindInRange(root.leftChild, start, end, result);
            }
            if(root.data < start){

            }recurseFindInRange(root.rightChild, start, end, result);
        }
    }
}
