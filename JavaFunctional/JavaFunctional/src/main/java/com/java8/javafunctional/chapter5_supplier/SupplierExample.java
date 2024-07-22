package com.java8.javafunctional.chapter5_supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier that returns a string
        Supplier<String> stringSupplier = () -> "Hello, World!";

        // Get the result from the supplier
        System.out.println(stringSupplier.get());  // Output: Hello, World!
    }
}

