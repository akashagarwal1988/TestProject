package com.y.epi.ch18;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by akasha on 2/16/16.
 */
public class NineComputeLargestRectangle {

    public int returnMaxArea(int[] arr) {
        PriorityQueue<Event> minHeap = new PriorityQueue<Event>(arr.length, new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.height.compareTo(o2.height);
            }
        });
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(new Event(i, arr[i]));
        }

        int low = 0;
        int high = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while (low <= high) {
            Event top = null;
            while (true) {
                top = minHeap.peek();
                if (top.i <= high && top.i >= low)
                    break;
                else
                    minHeap.remove();
            }
            if (top == null) {
                return -1;
            } else {
                max = Math.max(max, top.height * (high - low + 1));
                if (arr[low] < arr[high]) {
                    low++;
                } else {
                    high--;
                }
            }

        }
        return max;
    }

    class Event {
        int i;
        Integer height;

        public Event(int i, int height) {
            this.i = i;
            this.height = height;
        }
    }
}
