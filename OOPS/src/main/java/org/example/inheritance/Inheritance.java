package org.example.inheritance;

public class Inheritance extends Cat{
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        System.out.println(inheritance.cat());
        System.out.println(inheritance.dog());
    }
}

class Dog{
    public String dog(){
        return "Dog";
    }
}

class Cat extends Dog{
    public String cat(){
        return "Cat";
    }
}
