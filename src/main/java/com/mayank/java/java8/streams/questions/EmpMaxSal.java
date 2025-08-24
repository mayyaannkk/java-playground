package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.database.EmployeeDatabase;
import com.mayank.java.util.entities.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmpMaxSal {
    public static void main(String[] args) {
        // Find employee with maximum salary
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        Optional<Employee> first = employees.stream()
                        .max((a,b) -> Double.compare(a.getSalary(), b.getSalary()));
        System.out.println(first.get());
    }
}
