package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSample {
    public static void main(String[] args) {
        Deque<String> obj = new ArrayDeque<>();

        obj.offer("A");
        obj.offerFirst("B");
        obj.offerLast("C");

        obj.offer("D");
        obj.add("E");

        System.out.println(obj);

        obj.pollFirst();System.out.println(obj);
        obj.pollLast();System.out.println(obj);
    }
}
