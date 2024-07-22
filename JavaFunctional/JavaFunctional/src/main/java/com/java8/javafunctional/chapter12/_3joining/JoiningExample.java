package com.java8.javafunctional.chapter12._3joining;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        // Join employee names with commas and enclose in parentheses
        String namesConcatenated = empList.stream()
                .map(Employee::getName) // Extract names from employees
                .collect(Collectors.joining(", ", "(", ")")); // Concatenate names with comma, enclosed in parentheses

        // Print the result
        System.out.println(namesConcatenated);
    }
}
