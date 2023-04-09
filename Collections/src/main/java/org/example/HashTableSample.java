package org.example;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {
    public static void main(String[] args) {
        // HashTable wont allow null key or values Line 15,16 will throw error
        Hashtable<Integer,String> table = new Hashtable<>();

        table.put(1,"A");
        table.put(2,"B");
        table.put(3,"C");
        table.put(4,"D");
//        table.put(null,"F");
//        table.put(5, null);
        for(Map.Entry<Integer, String> m : table.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}
