package com.java8.javafunctional.chapter10._2intermediate.mappings.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpperCaseExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)  // Convert to uppercase
                .collect(Collectors.toList());

        System.out.println(upperCaseList);  // Output: [APPLE, BANANA, CHERRY]
    }
}
