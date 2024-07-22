package com.java8.javafunctional.chapter7_operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // UnaryOperator to increment a number by 1
        UnaryOperator<Integer> increment = x -> x + 1;

        // Apply the UnaryOperator
        System.out.println(increment.apply(5));  // Output: 6

        // UnaryOperator to convert a string to uppercase
        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();

        // Apply the UnaryOperator
        System.out.println(toUpperCase.apply("hello"));  // Output: HELLO
    }
}

