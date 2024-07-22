package com.java8.javafunctional.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelSequentialProcessingScenario {
    public static void main(String[] args) {
        // Generate a large list of numbers
        List<Integer> largeList = IntStream.rangeClosed(1, 500)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        // Sequential processing
        long startTime = System.currentTimeMillis();
        List<Integer> sequentialResult = largeList.stream()
                .map(n -> {
                    try {
                        Thread.sleep(10); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return n * n;
                })
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential processing time: " + (endTime - startTime) + " ms");

        // Parallel processing
        startTime = System.currentTimeMillis();
        List<Integer> parallelResult = largeList.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(10); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return n * n;
                })
                .collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println("Parallel processing time: " + (endTime - startTime) + " ms");
    }
}
