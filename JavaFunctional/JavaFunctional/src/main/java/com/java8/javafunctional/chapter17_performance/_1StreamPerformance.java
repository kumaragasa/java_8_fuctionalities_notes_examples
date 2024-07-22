package com.java8.javafunctional.chapter17_performance;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;
/*
* Sequential vs Parallel Stream
* */
public class _1StreamPerformance {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeRepository.getAllEmployees();

        // Sequential stream
        long startTime = System.nanoTime();
        List<String> sequentialResult = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .map(Employee::getName)
                .collect(Collectors.toList());
        long endTime = System.nanoTime();
        System.out.println("Sequential Time: " + (endTime - startTime) + " ns");

        // Parallel stream
        startTime = System.nanoTime();
        List<String> parallelResult = employees.parallelStream()
                .filter(e -> e.getSalary() > 5000)
                .map(Employee::getName)
                .collect(Collectors.toList());
        endTime = System.nanoTime();
        System.out.println("Parallel Time: " + (endTime - startTime) + " ns");
    }
}
