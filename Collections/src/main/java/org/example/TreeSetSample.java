package org.example;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<>();
        TreeSet<String> obj1 = new TreeSet<>(Collections.reverseOrder());

        obj.add("Rome");
        obj.add("Spain");
        obj.add("France");
        obj.add("Germany");
        obj.add("Germany");
        obj.add("France");

        obj1.add("Rome");
        obj1.add("Spain");
        obj1.add("France");
        obj1.add("Germany");
        obj1.add("Germany");
        obj1.add("France");

        System.out.println("Default order: "+obj);
        System.out.println("Reverse order: "+obj1);
    }
}
