package org.example;

import org.example.protectedPackage.ProtectedClass;

public class Main extends ProtectedClass {
    public static void main(String[] args) {
        System.out.println("Inside Main Class");
        Main main = new Main();
        // Even if we imported to different class protected method only works for the class where inherited using extends
        main.protectedMethod();
    }
}