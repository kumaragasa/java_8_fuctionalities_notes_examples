package com.java8.javafunctional.chapter10._1stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamFromMapKeysExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Stream<String> keyStream = map.keySet().stream();
        keyStream.forEach(System.out::println);
    }
}

