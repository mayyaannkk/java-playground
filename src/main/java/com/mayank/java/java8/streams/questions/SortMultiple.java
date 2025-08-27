package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.database.EmployeeDatabase;
import com.mayank.java.util.entities.Employee;

import java.util.Comparator;
import java.util.List;

public class SortMultiple {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        // Sort by salary, if salary is same, sort by name
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .forEach(System.out::println);
    }
}
