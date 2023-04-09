package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        // HashMap contains only one null Key, multiple null values
        HashMap<Integer,String> map  = new HashMap<>();

        map.put(1,"A");
        map.put(null,"B");
        map.put(null,"A"); // Null key overwrite from B to Value
        map.put(4,null);
        map.put(3,null);
        map.put(2,null);

        for(Map.Entry<Integer, String> en : map.entrySet()){
            System.out.println(en.getKey()+":"+en.getValue());
        }
    }
}
