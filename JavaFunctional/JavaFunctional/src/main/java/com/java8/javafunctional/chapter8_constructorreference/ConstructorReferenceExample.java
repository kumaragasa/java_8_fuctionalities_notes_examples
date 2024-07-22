package com.java8.javafunctional.chapter8_constructorreference;

import java.util.function.Supplier;
/*
* No-Argument Constructor
* */
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // Lambda expression
        Supplier<Person> personSupplierLambda = () -> new Person();

        // Constructor reference
        Supplier<Person> personSupplierMethodRef = Person::new;

        Person person = personSupplierMethodRef.get();
        System.out.println(person);  // Output: Person{name='Default Name'}
    }
}

class Person {
    private String name;

    public Person() {
        this.name = "Default Name";
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

