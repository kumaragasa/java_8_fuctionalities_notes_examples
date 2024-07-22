package com.java8.javafunctional.chapter9_lambdavariable;

import java.util.function.Consumer;

public class LambdaLocalVariableExample {
    public static void main(String[] args) {
        String greeting = "Hello";  // effectively final variable

        Consumer<String> greeter = name -> System.out.println(greeting + ", " + name);
        greeter.accept("World");  // Output: Hello, World

        // Uncommenting this for now to avoid a compile-time error
//         greeting = "Hi";
    }
}

