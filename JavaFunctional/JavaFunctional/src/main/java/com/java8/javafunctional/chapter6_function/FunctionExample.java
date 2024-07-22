package com.java8.javafunctional.chapter6_function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Function to convert a string to its length
        Function<String, Integer> stringLength = s -> s.length();

        // Apply the function
        System.out.println(stringLength.apply("Hello"));  // Output: 5

        // Function to double an integer
        Function<Integer, Integer> doubleValue = x -> x * 2;

        // Compose functions: first get the length, then double it
        Function<String, Integer> lengthThenDouble = stringLength.andThen(doubleValue);

        // Apply the composed function
        System.out.println(lengthThenDouble.apply("Hello"));  // Output: 10
    }
}

