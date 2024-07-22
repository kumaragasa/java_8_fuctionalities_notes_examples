package com.java8.javafunctional.chapter11._6iterating;

import java.util.Arrays;
import java.util.List;

public class JavaStreamIterateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using forEach with method reference to print each number
        numbers.stream().forEach(System.out::println);
    }
}
