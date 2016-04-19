package com.y.com.y.common.utils;

/**
 * Created by akasha on 2/8/16.
 */
public class Event {

    public Integer startTime;
    public Integer endTime;

    public Event(Integer startTime, Integer endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String toString(){
        return "StartTime " + this.startTime + " EndTime " + this.endTime;
    }
}
