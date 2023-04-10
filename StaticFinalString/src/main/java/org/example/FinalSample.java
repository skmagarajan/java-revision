package org.example;

//Final Variable - Cannot update/modify
//Final Method - Cannot method override
//Final Class - Cannot inherit
public class FinalSample {
    public static void main(String[] args) {
        final int a = 1;
        System.out.println(a);

        FinalSample finalSample = new FinalSample();

//        a = 3; // Wont allow because a is final variable
    }
}

class FinalA{
    public final boolean finalMethod(){
        System.out.println("Inside Final Method");
        return true;
    }
}

class FinalB extends FinalA{
    // Below statement throw an error becuase final method cannot be override
//    public boolean finalMethod(){
//
//    }
}

final class FinalC{

}

// Cannot inherit final Class below will throw an error
//class FinalD extends FinalC{
//
//}
