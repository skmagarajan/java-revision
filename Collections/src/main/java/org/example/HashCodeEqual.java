package org.example;

import java.util.Objects;

public class HashCodeEqual {
    public static void main(String[] args) {
        HashCode h1 = new HashCode(123);
        HashCode h2 = new HashCode(123);

        System.out.println(h1==h2);
        System.out.println(h1.equals(h2)); // Will return false if there is no hashCode and equals are not override once added will return true
    }
}

class HashCode {
    int num;

    public HashCode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "HashCode{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode hashCode = (HashCode) o;
        return num == hashCode.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
