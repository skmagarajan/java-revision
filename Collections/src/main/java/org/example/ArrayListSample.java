package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Rome");
        arr.add("Spain");
        arr.add("France");
        arr.add("Germany");

        System.out.println(arr);

        Iterator<String> it = arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("ListIterator");
        ListIterator itList = arr.listIterator();

        while(itList.hasNext()){
            System.out.println(itList.next());
        }
        System.out.println("Previous");
        while(itList.hasPrevious()){
            System.out.println(itList.previous());
        }
    }
}
