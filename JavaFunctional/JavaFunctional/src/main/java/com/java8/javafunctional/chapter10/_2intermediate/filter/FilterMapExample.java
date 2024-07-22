package com.java8.javafunctional.chapter10._2intermediate.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        Map<String, Integer> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getValue() >= 3)  // Filter out entries with values less than 3
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);  // Output: {Three=3, Four=4}
    }
}

