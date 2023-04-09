package org.example;

import java.util.HashSet;
import java.util.Set;
public class HashSetSample {
    public static void main(String[] args) {
        Set<String> obj = new HashSet<>();

        obj.add("Rome");
        obj.add("Spain");
        obj.add("France");
        obj.add("Germany");
        obj.add("Germany");
        obj.add("France");

        System.out.println(obj);
    }
}
