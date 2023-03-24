package org.example.operations;

// Interface can hold only abstract class and final variables.
// Before Java 8 we need to mention the abstract and final in code, After 8, it will be automatically considered
// From Java 9, Interface can hold default and static methods
public interface OperationInterface {
    int add(int x,int y);
    int sub(int x,int y);

    public default void testing1(int y){

    }

    public static void testing2(int y){

    }
}
