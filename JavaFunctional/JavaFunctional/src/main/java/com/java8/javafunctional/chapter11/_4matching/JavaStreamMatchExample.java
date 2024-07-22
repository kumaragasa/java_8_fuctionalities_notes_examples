package com.java8.javafunctional.chapter11._4matching;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;

public class JavaStreamMatchExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        // Check if any employee height is less than 130
        boolean anyMatch = empList.stream().anyMatch(e -> e.getHeight() < 130);
        System.out.println("Any employee height is less than 130: " + anyMatch);

        // Check if all employees have a salary greater than 4000
        boolean allMatch = empList.stream().allMatch(e -> e.getSalary() > 4000);
        System.out.println("All employees have salary greater than 4000: " + allMatch);

        // Check if no employee has a salary less than 4000
        boolean noneMatch = empList.stream().noneMatch(e -> e.getSalary() < 4000);
        System.out.println("No employee has salary less than 4000: " + noneMatch);
    }
}
