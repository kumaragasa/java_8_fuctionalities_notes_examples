package com.java8.javafunctional.chapter16_errorHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _1StreamErrorHandling {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("1", "2", "three", "4");

        List<Integer> result = data.stream()
                .map(wrap(Integer::parseInt))
                .collect(Collectors.toList());

        System.out.println("Processed Data: " + result);
    }

    // Wrapper function to handle exceptions
    private static <T, R> Function<T, R> wrap(FunctionWithException<T, R> function) {
        return i -> {
            try {
                return function.apply(i);
            } catch (Exception e) {
                System.err.println("Exception occurred: " + e.getMessage());
                return null;
            }
        };
    }

    @FunctionalInterface
    public interface FunctionWithException<T, R> {
        R apply(T t) throws Exception;
    }
}

