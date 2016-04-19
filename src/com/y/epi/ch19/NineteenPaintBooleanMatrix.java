package com.y.epi.ch19;

import java.util.Stack;

/**
 * Created by akasha on 2/10/16.
 */
public class NineteenPaintBooleanMatrix {

    public static int[][] paintBooleanMatrix(int[][] arr, int startX, int startY) {
        Stack<Coordinate> stack = new Stack();
        Coordinate start = new Coordinate(startX, startY);
        stack.push(start);
        while (!stack.isEmpty()) {
            Coordinate node = stack.pop();
            int x = node.x;
            int y = node.y;
            if (x > 0 && arr[x - 1][y] == 0) {
                stack.push(new Coordinate(x - 1, y));
            }
            if (y > 0 && arr[x][y - 1] == 0) {
                stack.push(new Coordinate(x, y - 1));
            }
            if (x < arr.length - 1 && arr[x + 1][y] == 0) {
                stack.push(new Coordinate(x + 1, y));
            }
            if (y < arr[0].length - 1 && arr[x][y + 1] == 0) {
                stack.push(new Coordinate(x, y + 1));
            }
            arr[x][y] = 1;
        }
        return arr;

    }
}

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
