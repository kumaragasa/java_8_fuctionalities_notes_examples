package com.java8.javafunctional.chapter8_methodreference;

import java.util.Arrays;
import java.util.List;
/*
* Reference to an Instance Method of an Arbitrary Object of a Particular Type
* */
public class MethodReferenceExample3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        // Lambda expression
        strings.forEach(s -> System.out.println(s));

        // Method reference
        strings.forEach(System.out::println);
    }
}
