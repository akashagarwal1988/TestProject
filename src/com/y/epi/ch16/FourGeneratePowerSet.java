package com.y.epi.ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akasha on 2/15/16.
 */
public class FourGeneratePowerSet {

    static List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     public static List<ArrayList<Integer>> generatePowerSet(List<Integer> numbers){
         result.add(new ArrayList<Integer>());
        return generateRecursively(numbers, 0);
    }

    private static List<ArrayList<Integer>> generateRecursively(List<Integer> numbers, int count){
        if(count==numbers.size()){
            return result;
        }else{
            List<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();


            for(List<Integer> resultList: result){
                ArrayList<Integer> list = new ArrayList<Integer>(resultList);
                list.add(numbers.get(count));
                tmp.add(list);
            }
            System.out.println
                    ("Tmp " + Arrays.toString(tmp.toArray()));
            result.addAll(tmp);
            generateRecursively(numbers, count + 1);
        }
        return result;
    }


//    private static List<ArrayList<Integer>> generateRecursively(List<Integer> numbers, int count, List<ArrayList<Integer>> result){
//        if(count == numbers.size()){
//            return result;
//        }else{
//            Integer number = numbers.get(count);
//            generateRecursively(numbers, ++count, result);
//            List<List<Integer>> tmp = new ArrayList();
//            for(int i = 0; i < result.size(); i++){
//                List<Integer> list = result.get(i);
//                ArrayList<Integer> tmpList = new ArrayList<Integer>(list);
//                tmpList.add(number);
//                tmp.add(tmpList);
//            }
//            result.addAll(tmp);
//        }
//    }
}
