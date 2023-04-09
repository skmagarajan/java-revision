package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Rome");
        list.add("Spain");
        list.add("France");
        list.add("Germany");

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("ListIterator");
        ListIterator itList = list.listIterator();

        while(itList.hasNext()){
            System.out.println(itList.next());
        }
        System.out.println("Previous");
        while(itList.hasPrevious()){
            System.out.println(itList.previous());
        }
    }
}
