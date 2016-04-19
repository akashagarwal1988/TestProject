package com.y.Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by akasha on 3/6/16.
 */
public class MiriyalaQuestion {

   // List<List<boolean>> visited = new ArrayList();

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int totalBoxes = sc.nextInt();
        List<List<Character>> result = new ArrayList();
        for(int i = 0; i< totalBoxes; i++){
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int boxWidth = Integer.parseInt(inputArr[0]);
            int startX = Integer.parseInt(inputArr[1]);
            int startY = Integer.parseInt(inputArr[2]);
            makeBox(boxWidth, startX, startY, inputArr, result);
        }
        System.out.println(result);
    }

    public static void makeBox(int boxWidth, int startX, int startY, String[] inputArr, List<List<Character>> result){
        for(int i = 3; i < inputArr.length; i++){
            List<Character> list = result.get(startY) != null ? result.get(startY) : new ArrayList<Character>();
            startY++;
            int initialSize = list.size();
            int currX = 0;
            while(currX < boxWidth && list.size() == 0){
                list.add(' ');
                currX++;
            }

            while(currX < boxWidth && inputArr[i].length() <= boxWidth - currX){
                for(char c: inputArr[i].toCharArray()){
                    list.add(c);
                    currX++;
                }
                i++;
            }
            while(currX < boxWidth){
                list.add(' ');
            }
        }
    }
}
