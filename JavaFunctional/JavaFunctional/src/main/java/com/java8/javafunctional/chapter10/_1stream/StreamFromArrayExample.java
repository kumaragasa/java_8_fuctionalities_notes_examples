package com.java8.javafunctional.chapter10._1stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArrayExample {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        //Using Arrays.stream():
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);

        //Using Stream.of():
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(System.out::println);
    }
}

