package com.java8.javafunctional.chapter10._2intermediate.mappings.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedCustomExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> sortedList = list.stream()
                .sorted(Comparator.comparingInt(String::length))  // Custom comparator
                .collect(Collectors.toList());

/*
        List<String> sortedList = list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))  // Custom comparator
                .collect(Collectors.toList());
*/

        System.out.println(sortedList);  // Output: [date, apple, banana, cherry]
    }
}
