package com.java8.javafunctional.chapter11._5finding;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamMinMaxExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        //Min
        System.out.println("Employee Kids > 3 and having min salary");
        Optional<Employee> minEmpOpt = empList.stream()
                .filter(emp -> emp.getKids() > 3)
                .min(Comparator.comparing(Employee::getSalary));
        System.out.println(minEmpOpt.get());

        System.out.println();
        //max
        System.out.println("Employee Kids > 3 and having max salary");
        Optional<Employee> maxEmpOpt = empList.stream()
                .filter(emp -> emp.getKids() > 3)
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxEmpOpt.get());


        //MaxBy
        Employee employee = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .get();
        System.out.println("Employee with max salary " + employee);

        //MinBy
        Employee emp2 = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)))
                .get();
        System.out.println("Employee with MIN salary " + emp2);
    }
}
