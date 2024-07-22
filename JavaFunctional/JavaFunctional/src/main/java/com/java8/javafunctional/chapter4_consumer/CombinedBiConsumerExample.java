package com.java8.javafunctional.chapter4_consumer;

import java.util.function.BiConsumer;

public class CombinedBiConsumerExample {
    public static void main(String[] args) {
        // BiConsumer to print the first argument
        BiConsumer<String, String> printFirst = (str1, str2) -> System.out.println("First: " + str1);

        // BiConsumer to print the second argument
        BiConsumer<String, String> printSecond = (str1, str2) -> System.out.println("Second: " + str2);

        // Combine BiConsumers
        BiConsumer<String, String> combinedBiConsumer = printFirst.andThen(printSecond);

        // Use the combined BiConsumer
        combinedBiConsumer.accept("Hello", "World");
        // Output: First: Hello
        //         Second: World
    }
}
