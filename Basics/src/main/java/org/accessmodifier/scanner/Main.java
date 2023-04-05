package org.accessmodifier.scanner;

import java.util.Scanner;

public class Main {

    public static void displayEven(int n){
        int i = 2;
        while(i < n){
            if(i%2 == 0)
                System.out.print(i+"/");
            i++;
        }
    }

    public void displayOdd(int n){
        int i = 1;
        while(i < n){
            if(i%2 != 0)
                System.out.print(i+"/");
            i++;
        }
    }
    public static void main(String[] args) {
        // Below no need to import System Class is imported default from lang package
        Scanner scanner = new Scanner(System.in);
        Main mainObject = new Main();

        System.out.println("Display even number from 1 to N? Enter N: ");
        int n = scanner.nextInt();

        //displayEven is static so no need object to call it
        displayEven(n);

        System.out.println();

        System.out.println("Display odd number from 1 to N? Enter N: ");
        int n2 = scanner.nextInt();

        //displayEven is not static so we need object to call it
        mainObject.displayOdd(n2);
    }
}
