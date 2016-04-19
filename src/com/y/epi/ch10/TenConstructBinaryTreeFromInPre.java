package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by akasha on 2/7/16.
 */
public class TenConstructBinaryTreeFromInPre {

    public static TreeNode result;

    public static TreeNode constructBinaryTree(List<Integer> inOrder, List<Integer> preOrder){
        Map<Integer, Integer> map = new  HashMap();
        for(int i = 0;i<inOrder.size();i++){
            map.put(inOrder.get(i), i);
        }
        Integer parent = preOrder.get(0);
        preOrder.remove(0);
        TreeNode root = new TreeNode(parent);
        constructBinaryTreeRec(map, preOrder, root);
        return root;
    }

    public static void constructBinaryTreeRec(Map<Integer, Integer> map, List<Integer> preOrder, TreeNode parent){
        if(preOrder.size() == 0)
            return;
        TreeNode child1 = new TreeNode(preOrder.get(0));
        if(map.get(parent.data) > map.get(child1.data)){
            parent.leftChild = child1;
        }else
            parent.rightChild = child1;
        preOrder.remove(0);
        constructBinaryTreeRec(map, preOrder, child1);
    }
}
