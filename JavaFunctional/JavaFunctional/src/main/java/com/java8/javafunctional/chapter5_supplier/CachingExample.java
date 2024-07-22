package com.java8.javafunctional.chapter5_supplier;

import java.util.function.Supplier;

public class CachingExample {
    private Supplier<Double> cachedValueSupplier = this::computeExpensiveValue;
    private Double cachedValue = null;

    public static void main(String[] args) {
        CachingExample example = new CachingExample();
        System.out.println(example.getCachedValue());  // Computes and prints the value
        System.out.println(example.getCachedValue());  // Prints the cached value
    }

    private double computeExpensiveValue() {
        System.out.println("Computing expensive value...");
        return Math.random();
    }

    public double getCachedValue() {
        if (cachedValue == null) {
            System.out.println("Setting cached value");
            cachedValue = cachedValueSupplier.get();
        }
        return cachedValue;
    }
}

