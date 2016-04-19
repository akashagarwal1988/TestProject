package com.y.epi.ch11;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by akasha on 4/3/16.
 */
public class FiveComputeMedianOfOnlineData {

    public static void returnMedianOfOnlineData(){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            //When the two heap's size is same,
            // I will check the minHeap's peek element and insert it to maxHeap if its less than num.
            if(maxHeap.size() <= minHeap.size()) {
                if(!minHeap.isEmpty() && minHeap.peek() < num) {
                    maxHeap.add(minHeap.remove());
                    minHeap.add(num);
                }else{
                    maxHeap.add(num);
                }
                System.out.println("Median at this point " + maxHeap.peek());

            }
            else{
                // If maxHeap is bigger than minHeap, we will compare the num with maxHeap's peek .
                // If its greater than we will insert into minHeap.
                //If its lesser than we will remove maxHeap's peek and insert into minHeap and insert num into maxHeap.

                if(minHeap.isEmpty())
                    minHeap.add(num);
                else if(maxHeap.peek() > num){
                    minHeap.add(maxHeap.remove());
                    maxHeap.add(num);
                }else{
                    minHeap.add(num);
                }
                System.out.println("Median at this point " + (maxHeap.peek() + minHeap.peek()) / 2);
            }
        }
    }
}
