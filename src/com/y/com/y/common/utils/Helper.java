package com.y.com.y.common.utils;

/**
 * Created by akasha on 12/20/15.
 */
public class Helper {

    public static String printBinary(int number) {
        String result = "";
        while (number > 0) {
            if (number % 2 == 1) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            number = number / 2;
        }
        return result;
    }

    public static void printInOrderTree(TreeNode root){
        if(root == null)
            return;
        printInOrderTree(root.leftChild);
        System.out.printf("->" + root.data);
        printInOrderTree(root.rightChild);
    }
}
