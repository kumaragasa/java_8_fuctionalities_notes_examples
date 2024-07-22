package com.java8.javafunctional.chapter13._1parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelProcessingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long startTime = System.currentTimeMillis();

        // Parallel processing
        numbers.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(100); // Simulate long computation
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return n * 2;
                })
                .forEach(System.out::println);

        long endTime = System.currentTimeMillis();
        System.out.println("Parallel processing time: " + (endTime - startTime) + " ms");
    }
}

