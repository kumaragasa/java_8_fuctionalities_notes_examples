package com.java8.javafunctional.chapter7_operator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class CombinedBinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (x, y) -> x + y;
        Function<Integer, String> toString = x -> "Result: " + x;

        // Apply the combined BinaryOperator
        System.out.println(add.andThen(toString).apply(3, 5));  // Output: Result: 8
    }
}

