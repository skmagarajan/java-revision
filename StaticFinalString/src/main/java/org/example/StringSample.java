package org.example;

public class StringSample {
    public static void main(String[] args) {
        // String is immutable and thread safe
        String s1 = new String("hello"); // Stored in heap as separate object
        String s2 = "hello"; // Stored in heap at the String pool with new ref
        String s3 = "hello"; // Stored in heap at the String pool with the s2 ref

        // == checks reference are same
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //false
        System.out.println(s2 == s3); //true

        // equals() checks the values are same
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s2.equals(s3)); //true

        //StringBuffer is thread-safe and mutable
        StringBuffer stringBuffer = new StringBuffer("hello");

        //StringBuilder is not thread safe and mutable
        StringBuilder stringBuilder = new StringBuilder("hello");
    }
}
