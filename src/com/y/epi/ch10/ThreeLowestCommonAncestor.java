package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

/**
 * Created by akasha on 4/3/16.
 */
public class ThreeLowestCommonAncestor {

    public TreeNode<Integer> findLCA(TreeNode<Integer> root, TreeNode<Integer> node1, TreeNode<Integer> node2) {


        if (root == null)
            return null;
        else {
            return findRecLCA(root, node1, node2).root;
        }
    }

    public Status findRecLCA(TreeNode<Integer> root, TreeNode<Integer> node1, TreeNode<Integer> node2) {
        //We will calculate LCA in bottom up approach.
        if (root == null) {
            return new Status(0, null);
        }
        Status leftStatus = findRecLCA(root.leftChild, node1, node2);
        if (leftStatus.numTargetNodes == 2)
            return leftStatus;

        Status rightStatus = findRecLCA(root.rightChild, node1, node2);
        if (rightStatus.numTargetNodes == 2)
            return rightStatus;

        int numTargeted = leftStatus.numTargetNodes + rightStatus.numTargetNodes + ((root == node1) ? 1 : 0) + ((root == node2) ? 1 : 0);
        // We need the check here so that in case there is no LCA we will just get back null as the LCA.
        //(If we would have just used root as second argument, we will get root even if there was no LCA as the answer.)
        return new Status(numTargeted, numTargeted == 2 ? root : null);

    }


    //Status class will contain the number of targeted nodes it contains(0 or 1 or 2).
    //Also it will contain the root this status belongs to.
    class Status {
        int numTargetNodes;
        TreeNode<Integer> root;

        public Status(int target, TreeNode<Integer> root) {
            this.numTargetNodes = target;
            this.root = root;
        }
    }
}
