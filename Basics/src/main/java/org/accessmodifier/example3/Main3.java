package org.accessmodifier.example3;

import org.accessmodifier.example.Main;

public class Main3 extends Main {
    public static void main(String[] args) {
        Main3 mainObject3 = new Main3();
        // Name is accessible because it is public
        System.out.println(mainObject3.name);

//         Protected is accessible because it is inherited
        System.out.println(mainObject3.location);

        // Private is not accessible
//        System.out.println(mainObject3.age);
    }
}
