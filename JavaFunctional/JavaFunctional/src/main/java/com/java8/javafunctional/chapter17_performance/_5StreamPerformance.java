package com.java8.javafunctional.chapter17_performance;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

/*
* Minimizing Terminal Operations
* */
public class _5StreamPerformance {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeRepository.getAllEmployees();

        // Multiple terminal operations
        long startTime = System.nanoTime();
        long count = employees.stream().count();
        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
        long endTime = System.nanoTime();
        System.out.println("Multiple Terminal Operations Time: " + (endTime - startTime) + " ns");

        // Single terminal operation
        startTime = System.nanoTime();
        List<Employee> employeeList = employees.stream().collect(Collectors.toList());
        count = employeeList.size();
        sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        endTime = System.nanoTime();
        System.out.println("Single Terminal Operation Time: " + (endTime - startTime) + " ns");
    }
}
