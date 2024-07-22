package com.java8.javafunctional.chapter10._2intermediate.filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry", "Avocado"));

        Set<String> filteredSet = set.stream()
                .filter(s -> !s.startsWith("A"))  // Filter out strings starting with "A"
                .collect(Collectors.toSet());

        System.out.println(filteredSet);  // Output: [Banana, Cherry]
    }
}

