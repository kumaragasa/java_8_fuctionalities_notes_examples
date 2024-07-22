package com.java8.javafunctional.chapter16_errorHandling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _4StreamErrorHandlingTryCatch {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("1", "2", "three", "4");

        List<Integer> result = data.stream()
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.err.println("Exception occurred: " + e.getMessage());
                        return null;
                    }
                })
                .filter(i -> i != null)
                .collect(Collectors.toList());

        System.out.println("Processed Data: " + result); // Output: Processed Data: [1, 2, 4]
    }
}

