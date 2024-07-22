package com.java8.javafunctional.chapter6_function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CombinedBiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Float> multiply = (x, y) -> (float) (x / y);
        Function<Float, String> toString = x -> "Result: " + x;

        BiFunction<Integer, Integer, String> combinedBiFunction = multiply.andThen(toString);

        System.out.println(combinedBiFunction.apply(22, 7));  // Output: Result: 15
    }
}

