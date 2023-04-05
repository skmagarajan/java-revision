package org.accessmodifier.example;

public class Main {
    public String name = "SK";
    protected String location = "FL";
    private int age = 25;
    public static void main(String[] args) {
        Main mainObject = new Main();
        Basics basicsObject = new Basics();

        System.out.println(mainObject.name);
        // location is protected it is accessible within same package
        System.out.println(mainObject.location);
        // Age is private it is accessible within same package
        System.out.println(mainObject.age);
    }
}

// Java can have any number of class within java file but only public class is allowed
//public class Basics {
//
//}
class Basics {

}