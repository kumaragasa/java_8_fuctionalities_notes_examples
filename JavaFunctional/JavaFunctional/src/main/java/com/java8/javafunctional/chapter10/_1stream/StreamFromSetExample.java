package com.java8.javafunctional.chapter10._1stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamFromSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        Stream<String> stream = set.stream();
        stream.forEach(System.out::println);
    }
}

