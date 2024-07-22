package com.java8.javafunctional.chapter9_lambdavariable;

import java.util.function.Function;

public class LambdaScopeExample {
    public static void main(String[] args) {
        int number = 10;

        Function<Integer, Integer> adder = x -> {
//             int number = 5;  // This will cause a compile-time error due to variable shadowing
            return x + number;
        };

        System.out.println(adder.apply(5));  // Output: 15
    }
}

