package org.example.abstraction;

public class Abstraction extends Operations{
    @Override
    int sub(int a, int b) {
        return a- b;
    }

    @Override
    int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        System.out.println(abstraction.add(1,2));
        System.out.println(abstraction.sub(1,2));
        System.out.println(abstraction.div(1,2));
    }
}

abstract class Operations{
    public int add(int a,int b){
        return a+b;
    }

    abstract int sub(int a,int b);
    abstract int div(int a,int b);
}
