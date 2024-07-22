package com.java8.javafunctional.chapter10._4distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctListExample {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,4,7,2,4,5,7,10,9,10,65);
        numList.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
