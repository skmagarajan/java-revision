package org.example.operations;

// Interface can hold only abstract class and final variables
public interface OperationInterface {
    int add(int x,int y);
    int sub(int x,int y);

    public default void testing1(int y){

    }

    public static void testing2(int y){

    }
}
