package com.java8.javafunctional.chapter12._2partitioning;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        // Partition employees by whether their salary is greater than 5,000
        Map<Boolean, List<Employee>> partitionedBySalary = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 5000));


        // Print partitioned employees
        System.out.println("Employees with salary > 5000:");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println("\nEmployees with salary <= 5000:");
        partitionedBySalary.get(false).forEach(System.out::println);
    }
}
