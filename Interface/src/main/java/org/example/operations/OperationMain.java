package org.example.operations;

public class OperationMain {
    public static void main(String[] args) {
        OperationClass op1 = new OperationClass();

        op1.add(1,2);
        op1.sub(2,1);

        // Creating interface object
        OperationInterface op2 = new OperationInterface() {
            @Override
            public int add(int x, int y) {
                return 0;
            }

            @Override
            public int sub(int x, int y) {
                return 0;
            }
        };
    }
}
