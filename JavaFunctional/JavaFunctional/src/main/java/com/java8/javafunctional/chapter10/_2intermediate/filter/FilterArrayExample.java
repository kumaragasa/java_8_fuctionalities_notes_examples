package com.java8.javafunctional.chapter10._2intermediate.filter;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class FilterArrayExample {
    public static void main(String[] args) {
        double[] array = {1.0, 2.5, 3.6, 7.8, 9.0, 4.3};

        double[] filteredArray = DoubleStream.of(array)
                .filter(d -> d >= 5.0)  // Filter out elements less than 5.0
                .toArray();

        System.out.println(Arrays.toString(filteredArray));  // Output: [7.8, 9.0]
    }
}

