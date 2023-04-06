package org.example.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        CreateProfile sam = new CreateProfile("SAM","111-111-111");
        CreateProfile victor = new CreateProfile("VICTOR","000-000-000");

        System.out.println(sam.name);
        // SSN is private so object cannot get it. Only way to get SSN is my getting get method
//        System.out.println(sam.SSN);
        System.out.println(sam.getSSN());
        System.out.println(victor.getName());
        System.out.println(victor.getSSN());
    }
}

class CreateProfile{
    private String SSN;
    public String name;

    CreateProfile(String name,String SSN){
        this.name = name;
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Private Class should be always mentioned as inner class below code will throw error
//private class X {
//
//}

class Y{
    private class X{
        // This private class works
    }
}
