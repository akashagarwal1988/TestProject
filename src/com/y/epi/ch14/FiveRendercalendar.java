package com.y.epi.ch14;

import com.y.com.y.common.utils.Event;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by akasha on 2/8/16.
 */
public class FiveRendercalendar {

    public static int findMaxConcurrentEvents(List<Event> list){
        Collections.sort(list, new Comparator<Event>(){
            @Override
            public int compare(Event a, Event b){
                return a.startTime.compareTo(b.startTime);
            }
        });

        System.out.println(Arrays.toString(list.toArray()));

        int maxCount = 0;
        Event first = list.get(0);
        for(int i = 1; i< list.size(); i++){
            Event next = list.get(i);
            int currCount = 1;
            while(first.endTime > next.startTime){
                first = new Event(next.startTime, first.endTime);
                currCount++;
                if(i<list.size()-1){
                    next = list.get(++i);
                }else{
                    break;
                }
            }
            maxCount = Math.max(maxCount, currCount);
            first = next;
        }
        return maxCount;

    }
}
