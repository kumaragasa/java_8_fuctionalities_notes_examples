package com.java8.javafunctional.chapter5_predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if a number is greater than 10
        Predicate<Integer> isGreaterThanTen = x -> x > 10;

        // Test the predicate
        System.out.println(isGreaterThanTen.test(5));  // Output: false
        System.out.println(isGreaterThanTen.test(15)); // Output: true

        // Predicate to check if a string is empty
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));  // Output: true
        System.out.println(isEmpty.test("Hello")); // Output: false
    }
}
