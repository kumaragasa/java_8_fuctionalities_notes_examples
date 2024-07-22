package com.java8.javafunctional.chapter10._4distinct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctSetExample {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>(Arrays.asList("apple","orange", "banana", "orange","mango"));
        set.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
