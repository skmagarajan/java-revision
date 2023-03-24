package org.example.constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();

        Constructor constructor1 = new Constructor(9,9);

        Child childConstructor = new Child();
        // ConstructorPrivate constructorPrivate = new ConstructorPrivate(); Private constructor will not allow to create object using new
    }
}
