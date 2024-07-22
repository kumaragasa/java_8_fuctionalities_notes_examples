package com.java8.javafunctional.chapter16_errorHandling;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _2StreamErrorHandlingWithOptional {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("1", "2", "three", "4");

        List<Integer> result = data.stream()
                .map(_2StreamErrorHandlingWithOptional::parseInt)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println("Processed Data: " + result);
    }

    private static Optional<Integer> parseInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.err.println("Exception occurred: " + e.getMessage());
            return Optional.empty();
        }
    }
}

