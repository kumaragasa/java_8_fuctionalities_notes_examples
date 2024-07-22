package com.java8.javafunctional.chapter11._1collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana");

        Set<String> set = items.stream()
                .collect(Collectors.toSet());

        System.out.println(set);  // Output: [banana, orange, apple]
    }
}
