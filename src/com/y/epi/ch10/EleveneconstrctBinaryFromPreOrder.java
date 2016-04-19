package com.y.epi.ch10;

import com.y.com.y.common.utils.TreeNode;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by akasha on 2/21/16.
 */
public class EleveneconstrctBinaryFromPreOrder {

    public static TreeNode reconstruct(String[] strings) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].equals("null")) {
                stack.push(null);
            } else {
                TreeNode node = new TreeNode<String>(strings[i]);
                try {
                    node.leftChild = stack.pop();
                    node.rightChild = stack.pop();
                } catch (EmptyStackException e) {
                    System.out.println("Stack is empty");
                }
                stack.push(node);
            }
        }
        if (stack.isEmpty())
            return null;
        else return stack.pop();
    }
}
