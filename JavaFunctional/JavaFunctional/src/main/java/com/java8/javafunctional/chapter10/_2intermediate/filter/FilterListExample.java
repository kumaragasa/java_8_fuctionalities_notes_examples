package com.java8.javafunctional.chapter10._2intermediate.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredList = list.stream()
                .filter(n -> n % 2 != 0)  // Filter out odd numbers
                .collect(Collectors.toList());

        System.out.println(filteredList);  // Output: [1, 3, 5, 7, 9]
    }
}

