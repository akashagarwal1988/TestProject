package com.y.epi.ch11;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by akasha on 2/21/16.
 */
public class ElevenImplementStackUsingHeap {

    PriorityQueue<Element> heap;
    int count;
    int capacity;

    public ElevenImplementStackUsingHeap(int capacity) {
        this.heap = new PriorityQueue<Element>(capacity, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.count.compareTo(o2.count);
            }
        });
        this.count = 0;
        this.capacity = capacity;

    }

    public int pop() {
        if (!heap.isEmpty()) {
            Element top = heap.remove();
            return top.data;
        } else {
            return -1;
        }
    }

    public void push(int data) {
        Element element = new Element(data, count++);
        if (heap.size() < capacity)
            heap.add(element);
        else {

        }
    }


    class Element {
        Integer data;
        Integer count;

        public Element(int data, int count) {
            this.data = data;
            this.count = count;
        }
    }
}
