package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 2/8/16.
 */
public class FiveComputeLCA {

    public static TreeNode findLCA(TreeNode<Integer> root, int a, int b) {
        while (root != null) {
            if (((a < root.data) && (b > root.data)) || ((b < root.data) && (a > root.data))) {
                return root;
            }
            if (root.data > a && root.data > b) {
                root = root.leftChild;
            }
            else
                root = root.rightChild;
        }
        return null;
    }
}
