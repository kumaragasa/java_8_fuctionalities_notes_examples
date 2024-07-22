package com.java8.javafunctional.chapter5_predicate;

import java.util.function.Predicate;

public class PredicateAndOrExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = x -> x > 10;
        Predicate<Integer> p2 = x -> x > 5;

        System.out.println(p1.or(p2).test(7));
    }

}
