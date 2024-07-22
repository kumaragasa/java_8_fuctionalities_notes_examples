package com.java8.javafunctional.chapter4_consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // BiConsumer to concatenate two strings and print the result
        BiConsumer<String, String> concatenateAndPrint = (str1, str2) -> System.out.println(str1 + str2);

        // Use the BiConsumer
        concatenateAndPrint.accept("Hello, ", "World!"); // Output: Hello, World!

        // BiConsumer to print two integers and their sum
        BiConsumer<Integer, Integer> sumAndPrint = (x, y) -> {
            int sum = x + y;
            System.out.println("First number: " + x);
            System.out.println("Second number: " + y);
            System.out.println("Sum: " + sum);
        };
        sumAndPrint.accept(5, 10); // Output: First number: 5
        //          Second number: 10
        //          Sum: 15
    }
}

