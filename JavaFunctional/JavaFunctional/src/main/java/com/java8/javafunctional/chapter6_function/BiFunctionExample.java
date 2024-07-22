package com.java8.javafunctional.chapter6_function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    static BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;

    public static void main(String[] args) {
        // BiFunction to concatenate two strings
//        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;

        // Apply the BiFunction
        System.out.println(concatenate.apply("Hello, ", "World!"));  // Output: Hello, World!

        // BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        // Apply the BiFunction
        System.out.println(add.apply(10, 20));  // Output: 30

        // Function to square an integer
        Function<Integer, Integer> square = x -> x * x;

        // Compose functions: first add, then square the result
        BiFunction<Integer, Integer, Integer> addThenSquare = add.andThen(square);

        // Apply the composed BiFunction
        System.out.println(addThenSquare.apply(3, 4));  // Output: 49
    }
}

