package com.java8.javafunctional.chapter5_supplier;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SupplierWithCollectionExample {
    public static void main(String[] args) {
        // Supplier that returns a random integer
        Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(100);

        // Generate a list of random integers
        List<Integer> randomNumbers = generateRandomList(randomIntSupplier, 5);

        // Print the list of random numbers
        randomNumbers.forEach(System.out::println);
    }

    public static List<Integer> generateRandomList(Supplier<Integer> supplier, int count) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
