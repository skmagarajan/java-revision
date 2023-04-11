package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSample {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println(o1.age+":"+o2.age);
                return Integer.compare(o1.age,o2.age);
            }
        });

        set.add(new Student("Sam",12));
        System.out.println(set);
        set.add(new Student("Ram",14));
        System.out.println(set);
        set.add(new Student("Ramesh",7));
        System.out.println(set);
        set.add(new Student("Suresh",8));
        System.out.println(set);
        set.add(new Student("Kabali",10));
        System.out.println(set);
    }
}

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
12:12
[Student{name='Sam', age=12}]
14:12
[Student{name='Sam', age=12}, Student{name='Ram', age=14}]
7:12
[Student{name='Ramesh', age=7}, Student{name='Sam', age=12}, Student{name='Ram', age=14}]
8:12
8:7
[Student{name='Ramesh', age=7}, Student{name='Suresh', age=8}, Student{name='Sam', age=12}, Student{name='Ram', age=14}]
10:12
10:7
10:8
[Student{name='Ramesh', age=7}, Student{name='Suresh', age=8}, Student{name='Kabali', age=10}, Student{name='Sam', age=12}, Student{name='Ram', age=14}]
 */
