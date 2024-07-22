package com.java8.javafunctional.chapter4_consumer;

import java.util.function.Consumer;

public class CombinedConsumerExample {
    public static void main(String[] args) {
        // Consumer to print a message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        // Consumer to convert a string to uppercase and print it
        Consumer<String> upperCaseConsumer = message -> System.out.println("Uppercase: " + message.toUpperCase());

        // Combine consumers
        Consumer<String> combinedConsumer = printMessage.andThen(upperCaseConsumer);

        // Use the combined consumer
        combinedConsumer.accept("hello, world!");
        // Output: Message: hello, world!
        //         Uppercase: HELLO, WORLD!
    }
}
