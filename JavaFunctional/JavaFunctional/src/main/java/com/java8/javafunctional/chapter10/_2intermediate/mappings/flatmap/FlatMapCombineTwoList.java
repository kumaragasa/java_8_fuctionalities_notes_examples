package com.java8.javafunctional.chapter10._2intermediate.mappings.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
* Flatten a list of lists into a single list.
* */
public class FlatMapCombineTwoList {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        System.out.println("Before flattening");
        System.out.println(listOfLists);

        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)  // Flatten the list of lists
                .collect(Collectors.toList());

        System.out.println("After flattening");
        System.out.println(flatList);  // Output: [a, b, c, d, e, f]
    }
}
