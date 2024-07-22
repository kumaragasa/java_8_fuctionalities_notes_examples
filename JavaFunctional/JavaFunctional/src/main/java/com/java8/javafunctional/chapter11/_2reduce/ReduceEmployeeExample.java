package com.java8.javafunctional.chapter11._2reduce;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;

public class ReduceEmployeeExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        String nameResult = empList.stream()
                .map(Employee::getName)
                .reduce("",(result,name)->String.join(",",result,name));

        System.out.println(nameResult);
    }
}
