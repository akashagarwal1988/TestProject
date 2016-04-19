package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

import java.util.ArrayList;

/**
 * Created by akasha on 2/21/16.
 */
public class FourteenComputeSiblings {

    public static TreeNode<Integer> computeRightSibling(TreeNode<Integer> root) {
        ArrayList<TreeNode> levelList = new ArrayList<TreeNode>();
        levelList.add(root);
        while (levelList.size() > 0) {
            ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();
            for (int i = 0; i < levelList.size(); i++) {
                TreeNode first = levelList.get(i);
                if (i + 1 < levelList.size()) {
                    TreeNode second = levelList.get(i + 1);
                    first.next = second;
                }
                if (first.leftChild != null)
                    nextLevel.add(first.leftChild);
                if (first.rightChild != null)
                    nextLevel.add(first.rightChild);
            }
            levelList = nextLevel;
        }
        return root;

    }
}
