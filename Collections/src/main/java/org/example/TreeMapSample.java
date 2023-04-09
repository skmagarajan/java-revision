package org.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map  = new TreeMap<>();
        // TreeMap contains no null Key because treemap will sort by key, multiple null values
        map.put(1,"A");
//        map.put(null,"B");
        map.put(4,null);
//        map.put(null,"A");
        map.put(3,null);
        map.put(2,"B");

        for(Map.Entry<Integer, String> en : map.entrySet()) {
            System.out.println(en.getKey() + ":" + en.getValue());
        }
    }
}
