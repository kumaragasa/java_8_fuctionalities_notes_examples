package com.java8.javafunctional.chapter11._1collect;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToStatistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));


        System.out.println(stats);
    }
}

