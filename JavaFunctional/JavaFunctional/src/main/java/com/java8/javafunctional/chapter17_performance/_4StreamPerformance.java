package com.java8.javafunctional.chapter17_performance;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
/*
* Using Primitive Streams
* */
public class _4StreamPerformance {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeRepository.getAllEmployees();

        // Using boxed streams
        long startTime = System.nanoTime();
        double averageSalaryBoxed = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        long endTime = System.nanoTime();
        System.out.println("Using Boxed Streams Time: " + (endTime - startTime) + " ns");

        // Using primitive streams
        startTime = System.nanoTime();
        double averageSalaryPrimitive = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        endTime = System.nanoTime();
        System.out.println("Using Primitive Streams Time: " + (endTime - startTime) + " ns");
    }
}
