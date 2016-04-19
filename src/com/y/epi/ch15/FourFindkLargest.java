package com.y.epi.ch15;

import com.y.com.y.common.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akasha on 3/6/16.
 */
public class FourFindkLargest {
    static List<Integer> result = new ArrayList<Integer>();

    public static List<Integer> findkLargest(TreeNode root, int k){
        findkHelper(root,  k , new ArrayList<Integer>());
        return result;
    }

    public static void findkHelper(TreeNode<Integer> root, int k, List<Integer> list){
        System.out.println("Root " + root.data + " list " + list);

        if(list.size() == k ){
            System.out.println("At this time " + list);
            result.addAll(list);
            return;
        }
        if(root.rightChild != null && list.size() <= k)
            findkHelper(root.rightChild, k, list);
        System.out.println("Calling add for " + root.data);
        list.add(root.data);
        if(root.leftChild != null && list.size() <= k){
            findkHelper(root.leftChild, k, list);
        }


    }
}
