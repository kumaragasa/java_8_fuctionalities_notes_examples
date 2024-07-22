package com.java8.javafunctional.chapter17_performance;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

/*
*  Using toArray Instead of collect
* */
public class _3StreamPerformance {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeRepository.getAllEmployees();

        // using Collect
        long startTime = System.nanoTime();
        List<String> resultUsingCollect = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        long endTime = System.nanoTime();
        System.out.println("Using toArray Time: " + (endTime - startTime) + " ns");

        // Using toArray
        startTime = System.nanoTime();
        String[] resultUsingToArray = employees.stream()
                .map(Employee::getName)
                .toArray(String[]::new);
        endTime = System.nanoTime();
        System.out.println("Using toArray Time: " + (endTime - startTime) + " ns");
    }
}
