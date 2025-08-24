package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.database.EmployeeDatabase;
import com.mayank.java.util.entities.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighSal {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        Optional<Employee> secondHigh = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        System.out.println(secondHigh);
    }
}
