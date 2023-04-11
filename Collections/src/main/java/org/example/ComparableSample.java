package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparableSample {
    public static void main(String[] args) {
        TreeSet<User> arr = new TreeSet<>();
        arr.add(new User("Ram", 25));
        System.out.println(arr);
        arr.add(new User("Sam", 30));
        System.out.println(arr);
        arr.add(new User("A", 33));
        System.out.println(arr);
        arr.add(new User("AB", 9));
        System.out.println(arr);
        arr.add(new User("X", 31));
        System.out.println(arr);
    }
}

class User implements Comparable<User>{
    public String name;
    public int age;

    User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        System.out.println(this.age+":"+o.age);
        return Integer.compare(this.age, o.age);
    }
}

/*
25:25
[User{name='Ram', age=25}]
30:25
[User{name='Ram', age=25}, User{name='Sam', age=30}]
33:25
33:30
[User{name='Ram', age=25}, User{name='Sam', age=30}, User{name='A', age=33}]
9:30
9:25
[User{name='AB', age=9}, User{name='Ram', age=25}, User{name='Sam', age=30}, User{name='A', age=33}]
31:30
31:33
[User{name='AB', age=9}, User{name='Ram', age=25}, User{name='Sam', age=30}, User{name='X', age=31}, User{name='A', age=33}]
 */
