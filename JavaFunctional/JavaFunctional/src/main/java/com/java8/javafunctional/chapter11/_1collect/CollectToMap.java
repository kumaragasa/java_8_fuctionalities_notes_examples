package com.java8.javafunctional.chapter11._1collect;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();
        Map<String, Double> employeeMap = empList.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        System.out.println(employeeMap);
    }
}
