package com.java8.javafunctional.chapter11._1collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana");

        List<String> list = items.stream()
                .collect(Collectors.toList());

        System.out.println(list);  // Output: [apple, banana, orange, apple, banana]
    }
}

