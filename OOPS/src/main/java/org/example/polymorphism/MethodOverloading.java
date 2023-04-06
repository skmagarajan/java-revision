package org.example.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Addition addObject = new Addition();

        System.out.println(addObject.add(1));
        System.out.println(addObject.add(1,2));
        System.out.println(addObject.add(1.1f,2.4f));
    }
}

class Addition{
    public int add(int x){
        return x;
    }

    public int add(int x,int y){
        return x+y;
    }

    public float add(float x,float y){
        return x+y;
    }
}