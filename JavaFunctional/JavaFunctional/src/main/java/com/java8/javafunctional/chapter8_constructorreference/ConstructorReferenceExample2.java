package com.java8.javafunctional.chapter8_constructorreference;

import java.util.function.Function;

public class ConstructorReferenceExample2 {
    public static void main(String[] args) {
        // Lambda expression
        Function<String, Student> studentFunctionLambda = name -> new Student(name);

        // Constructor reference
        Function<String, Student> studentFunctionMethodRef = Student::new;

        Student studentWithName = studentFunctionMethodRef.apply("John");
        System.out.println(studentWithName.getName());  // Output: John
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

