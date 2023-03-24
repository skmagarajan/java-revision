package org.example.constructor;

public class Constructor {
    public Constructor(){
        System.out.println("Inside Constructor");
    }

    public Constructor(int x,int y){
        System.out.println("Two args:"+x+" "+y);
    }
}

class Child extends Constructor{
    public Child(){
        System.out.println("Inside Child Constructor");
    }
}
