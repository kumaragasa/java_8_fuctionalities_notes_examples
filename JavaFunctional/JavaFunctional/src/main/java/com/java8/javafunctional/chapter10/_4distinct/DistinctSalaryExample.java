package com.java8.javafunctional.chapter10._4distinct;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctSalaryExample {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeRepository.getAllEmployees();
        List<Double> salaryList = employeeList.stream().map(Employee::getSalary).distinct().collect(Collectors.toList());
        System.out.println(salaryList);
    }
}
