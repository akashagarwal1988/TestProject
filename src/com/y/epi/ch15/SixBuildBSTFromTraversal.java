package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

import java.util.List;

/**
 * Created by akasha on 2/14/16.
 */
public class SixBuildBSTFromTraversal {

    public static TreeNode makeTreeFromPreOrder(List<TreeNode<Integer>> list) {
        System.out.printf("root ");
        return makeTreeRec(list, 0, list.size() - 1);
    }

    private static TreeNode makeTreeRec(List<TreeNode<Integer>> list, int low, int high) {
        if (low > high) {
            return null;
        }
        TreeNode<Integer> root = list.get(low);
        System.out.printf("root " + root.data);
        int i = low + 1;
        for (i = low + 1; i <= high; i++) {
            if (root.data < list.get(i).data) {
                break;
            }
        }
        root.leftChild = makeTreeRec(list, low + 1, i-1);
        root.rightChild = makeTreeRec(list, i, high);
        System.out.printf("root.leftChild " + ((root.leftChild == null) ? " null " : root.leftChild.data) );
        System.out.printf("root.rightChild " + ((root.rightChild == null) ? " null " : root.rightChild.data) );
        return root;
    }
}
