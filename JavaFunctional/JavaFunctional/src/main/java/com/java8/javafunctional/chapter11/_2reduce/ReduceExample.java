package com.java8.javafunctional.chapter11._2reduce;

import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10)
                .reduce(0, (total, num) -> total + num);

        System.out.println("Sum " + sum);

        long mult = IntStream.rangeClosed(1, 10)
                .reduce(1, (result, num) -> result * num);
        System.out.println("Mult " + mult);


    }
}
