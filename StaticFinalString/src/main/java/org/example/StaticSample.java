package org.example;

public class StaticSample {
    // Static Block will execute before main
    static{
        System.out.println("Inside Static Block");
    }

    // Static Method can access only static variables or else throws compile time error
    public static void staticMethod(){
        System.out.println("Inside Static Method");
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        A.B b = new A.B();
        b.X();

        staticMethod(); // Can call static method without object
    }
}

class A{
    // Static Class should be an inner Class
    int code1 = 1;
    static int code2 = 2;
    static class B{
        public void X(){
//            System.out.println("Inside Static Inner Class - X Method: "+code1); //Static class cannot access non-static variables from Outer Class.
            System.out.println("Inside Static Inner Class - X Method: "+code2); //Static class can access static variables from Outer Class.
        }
    }
}
