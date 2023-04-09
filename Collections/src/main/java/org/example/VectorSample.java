package org.example;

import java.util.*;

public class VectorSample {

    public static void main(String[] args) {
        Vector<String> obj = new Vector<>();

        obj.add("Rome");
        obj.add("Spain");
        obj.add("France");
        obj.add("Germany");

        System.out.println(obj);

        obj.addElement("England"); //addElement only available in Vector class
        Iterator<String> it = obj.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Using Enumeration");
        //Using Enumeration which is available only in the Vector class
        Enumeration<String> it1 = obj.elements();

        while(it1.hasMoreElements()){
            System.out.println(it1.nextElement());
        }
    }
}
