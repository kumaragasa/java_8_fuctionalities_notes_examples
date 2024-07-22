package com.java8.javafunctional.chapter10._2intermediate.mappings.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMapSplitStringListExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams",
                "flatMap example");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))  // Split and flatten
                .collect(Collectors.toList());

        System.out.println(words);  // Output: [Hello, world, Java, streams, flatMap, example]
    }
}
