package com.java8.javafunctional.chapter9_lambdavariable;

import java.util.function.Consumer;

public class LambdaVariableModificationExample {
    public static void main(String[] args) {
        int number = 10;

        Consumer<Integer> modifier = x -> {
            // number = x + 1;  // This will cause a compile-time error
            System.out.println(x + number);
        };

        modifier.accept(5);  // Output: 15
    }
}

