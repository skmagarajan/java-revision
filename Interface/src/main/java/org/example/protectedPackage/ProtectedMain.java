package org.example.protectedPackage;

public class ProtectedMain {
    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.protectedMethod();
    }
}
