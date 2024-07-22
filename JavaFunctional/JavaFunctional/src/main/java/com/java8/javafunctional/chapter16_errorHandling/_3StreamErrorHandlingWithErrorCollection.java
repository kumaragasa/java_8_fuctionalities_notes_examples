package com.java8.javafunctional.chapter16_errorHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _3StreamErrorHandlingWithErrorCollection {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("1", "2", "three", "4");
        List<String> errors = new ArrayList<>();

        List<Integer> result = data.stream()
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        errors.add(s);
                        return null;
                    }
                })
                .filter(i -> i != null)
                .collect(Collectors.toList());

        System.out.println("Processed Data: " + result); // Output: Processed Data: [1, 2, 4]
        System.out.println("Errors: " + errors); // Output: Errors: [three]
    }
}

