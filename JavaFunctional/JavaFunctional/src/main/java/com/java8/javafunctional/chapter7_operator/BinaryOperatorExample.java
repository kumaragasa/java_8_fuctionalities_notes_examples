package com.java8.javafunctional.chapter7_operator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // BinaryOperator to add two numbers
        BinaryOperator<Integer> add = (x, y) -> x + y;

        // Apply the BinaryOperator
        System.out.println(add.apply(5, 3));  // Output: 8

        // BinaryOperator to find the maximum of two numbers
        BinaryOperator<Integer> max = (x, y) -> x > y ? x : y;

        // Apply the BinaryOperator
        System.out.println(max.apply(5, 3));  // Output: 5
    }
}

