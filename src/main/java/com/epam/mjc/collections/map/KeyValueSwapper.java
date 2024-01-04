package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> results = new HashMap<>();

        for(Map.Entry<Integer, String> entry : sourceMap.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            Integer resultsKey = results.get(value);

            if(results.containsKey(value)){
                if(key < resultsKey){
                    results.put(value, key);
                }
            }else {
                results.put(value,key);
            }
        }

        return  results;
    }
}
