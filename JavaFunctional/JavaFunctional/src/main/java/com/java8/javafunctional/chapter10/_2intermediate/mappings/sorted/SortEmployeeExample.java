package com.java8.javafunctional.chapter10._2intermediate.mappings.sorted;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        List<Employee> sortedEmpList = empList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        sortedEmpList.forEach(System.out::println);

    }
}
