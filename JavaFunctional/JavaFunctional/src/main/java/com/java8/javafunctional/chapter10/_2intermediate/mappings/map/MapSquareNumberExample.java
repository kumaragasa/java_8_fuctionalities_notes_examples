package com.java8.javafunctional.chapter10._2intermediate.mappings.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapSquareNumberExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredList = list.stream()
                .map(n -> n * n)  // Apply the square function
                .collect(Collectors.toList());

        System.out.println(squaredList);  // Output: [1, 4, 9, 16, 25]
    }
}
