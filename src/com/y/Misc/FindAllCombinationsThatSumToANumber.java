package com.y.Misc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given a number, find all the possible combinations such that their sum is equal to that number
 *
 */
public class FindAllCombinationsThatSumToANumber {

    public static void main(String[] args){
        System.out.println(returnPossibleCombinations(4));
    }

    public static List<List<Integer>> returnPossibleCombinations(int number){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> currList = new ArrayList<Integer>();
        performRecursiveCombos(number, currList, result, 0);
        return result;
    }

    public static void performRecursiveCombos(int number, List<Integer> currList, List<List<Integer>> result, int currSum){
        if(currSum == number){
            result.add(new ArrayList<Integer>(currList));
            return;
        }
        for(int i = 1; i <= number; i++){
            if(currSum + i <= number){
                currList.add(i);
                currSum = currSum + i;
                performRecursiveCombos(number, currList, result, currSum);
                currList.remove(currList.size()-1);
                currSum = currSum - i;
            }
        }
    }
}
