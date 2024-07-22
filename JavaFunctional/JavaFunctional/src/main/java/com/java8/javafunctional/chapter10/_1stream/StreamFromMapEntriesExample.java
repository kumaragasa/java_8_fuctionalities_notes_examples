package com.java8.javafunctional.chapter10._1stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamFromMapEntriesExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
        entryStream.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}

