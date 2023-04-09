package org.example;

import java.util.PriorityQueue;

public class PriorityQueueSample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        System.out.println(pq.peek()); // Return Null if queue is empty else top element
        pq.add("A");
        pq.offer("B");

        System.out.println(pq.element()); // Return top element if empty returns exception
        System.out.println(pq);
        pq.poll(); // Removes top element
        System.out.println(pq);
        pq.remove(); // Throw exception if empty
        pq.poll();// Return null if empty
        System.out.println(pq);
    }
}
