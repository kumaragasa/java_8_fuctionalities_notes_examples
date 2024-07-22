package com.java8.javafunctional.chapter7_operator;

import java.util.function.UnaryOperator;

public class CombinedUnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x + 1;
        UnaryOperator<Integer> square = x -> x * x;

        // Combine UnaryOperators: first increment, then square
        System.out.println(increment.andThen(square).apply(3));  // Output: 16
    }
}

