package com.java8.javafunctional.chapter8_methodreference;

import java.util.function.Supplier;
/*
* Reference to an Instance Method of a Particular Object
* */
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Lambda expression
        Supplier<String> stringSupplierLambda = () -> str.toUpperCase();

        // Method reference
        Supplier<String> stringSupplierMethodRef = str::toUpperCase;

        System.out.println(stringSupplierMethodRef.get());  // Output: HELLO, WORLD!
    }
}
