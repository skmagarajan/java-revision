package org.example.operations;

public class OperationClass implements OperationInterface {
    @Override
    public int add(int x, int y) {
        System.out.println("Addition: "+ (x+y));
        return 0;
    }

    @Override
    public int sub(int x, int y) {
        System.out.println("Subtraction: "+ (x-y));
        return 0;
    }
}
