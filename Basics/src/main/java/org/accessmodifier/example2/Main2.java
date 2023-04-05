package org.accessmodifier.example2;

//import org.example.Basics;
import org.accessmodifier.example.Main;
public class Main2 {
    public static void main(String[] args) {
        Main mainObject2 = new Main();

        // Name is accessible because it is public
        System.out.println(mainObject2.name);

        // Protected is not accessible
//        System.out.println(mainObject2.location);

        // Private is not accessible
//        System.out.println(mainObject2.age);

        // Even we import basics class basics to different package it is not accessible
        // Because Basics is default type. To access it should be public
//        Basics b = new Basics();

    }
}
