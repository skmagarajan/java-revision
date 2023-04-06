package org.example.polymorphism;

public class MethodOverriding extends SuperClass{

    public String message(){
        return "I am child class";
    }

    public String parentMessage(){
        return super.message();
    }
    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();
        System.out.println(methodOverriding.message());
        System.out.println(methodOverriding.parentMessage());
    }
}

class SuperClass{
    public String message(){
        return "I am super class";
    }
}
