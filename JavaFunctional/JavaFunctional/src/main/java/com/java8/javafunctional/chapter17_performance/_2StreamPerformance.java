package com.java8.javafunctional.chapter17_performance;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Avoiding Unnecessary Operations
 * */
public class _2StreamPerformance {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeRepository.getAllEmployees();
        // Unnecessary operations
        long startTime = System.nanoTime();
        List<String> resultWithUnnecessaryOps = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        long endTime = System.nanoTime();
        System.out.println("With Unnecessary Operations Time: " + (endTime - startTime) + " ns");

        // Necessary operations only
        startTime = System.nanoTime();
        List<String> resultWithoutUnnecessaryOps = employees.stream()
                .filter(e -> e.getName().length() > 3)
                .map(e -> e.getName().toUpperCase())
                .collect(Collectors.toList());
        endTime = System.nanoTime();
        System.out.println("Without Unnecessary Operations Time: " + (endTime - startTime) + " ns");

    }
}
