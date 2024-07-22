package com.java8.javafunctional.chapter10._3sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);

        List<Integer> sortedList = list.stream()
                .sorted()  // Natural order sorting
                .collect(Collectors.toList());

        System.out.println(sortedList);  // Output: [1, 2, 3, 4, 5]
    }
}