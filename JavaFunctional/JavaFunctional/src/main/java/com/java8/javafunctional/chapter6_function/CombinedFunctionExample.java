package com.java8.javafunctional.chapter6_function;

import java.util.function.Function;

public class CombinedFunctionExample {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        Function<String, String> addExclamation = s -> s + "!";

        Function<String, String> combinedFunction = toUpperCase.andThen(addExclamation);

        System.out.println(combinedFunction.apply("hello"));  // Output: HELLO!
    }
}

