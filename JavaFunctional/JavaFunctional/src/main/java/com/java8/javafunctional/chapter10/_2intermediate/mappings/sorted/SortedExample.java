package com.java8.javafunctional.chapter10._2intermediate.mappings.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);

        List<Integer> sortedList = list.stream()
                .sorted()  // Natural order sorting
                .collect(Collectors.toList());

        System.out.println(sortedList);  // Output: [1, 2, 3, 4, 5]


        List<String> list1 = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> sortedList1 = list1.stream()
                .sorted(Comparator.reverseOrder())  // Reverse order sorting
                .collect(Collectors.toList());

        System.out.println(sortedList1);  // Output: [date, cherry, banana, apple]
    }
}
