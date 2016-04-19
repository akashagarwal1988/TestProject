package com.y.epi.ch13;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by akasha on 2/6/16.
 */
public class FourImplementISBNCache {

    LinkedHashMap<Integer, Integer> isbnToPriceMap;
    int capacity;

    public FourImplementISBNCache(final int capacity){
        this.capacity = capacity;
        isbnToPriceMap = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return isbnToPriceMap.size() > capacity;
            }
        };
    }

    public void insert(int isbn, int price){
        if(isbnToPriceMap.containsKey(isbn)){
            isbnToPriceMap.get(isbn);
        }else{
            isbnToPriceMap.put(isbn, price);
        }
    }

    public Integer get(int isbn){
        if(isbnToPriceMap.size() > 0 && isbnToPriceMap.containsKey(isbn)){
            return isbnToPriceMap.get(isbn);
        }else
            return null;
    }

    public Integer remove(int isbn){
         return isbnToPriceMap.remove(isbn);
    }

}
