package com.mayank.java.java8;

import com.mayank.java.util.database.EmployeeDatabase;
import com.mayank.java.util.entities.Employee;
import com.mayank.java.util.entities.Project;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MethodCheatSheet {

    /*
    https://www.youtube.com/watch?v=-RHvF37el-A&t=164s
    forEach(Consumer)
    filter(Predicate)
    collect(Collection)
    map(Function)
    distinct()
    flatMap(Function)
    sorted(Comparator both ASC and DESC)
    min() & max()
    GroupBy
    findFirst(), findAny()
    anyMatch(Predicate), allMatch(Predicate), noneMatch(Predicate)
    limit(long maxSize)
    skip(long n)
     */
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        // forEach(Consumer)
        employees.forEach(employee -> System.out.println(employee.getName() + " : " + employee.getSalary()));

        // filter(Predicate)
        List<Employee> filter = employees.stream()
                .filter(employee -> employee.getDept().equals("Development") && employee.getSalary() > 80000)
                .toList();
        System.out.println("Filter: " + filter);

        // map(Collector)
        Map<Integer, String> map = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println("======Collector MAP========");
        System.out.println(map);

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(collect);

        // Map, Distinct
        // Fetching simple fields from employees
        List<String> names = employees.stream().map(Employee::getName).distinct().toList();
        System.out.println("===========MAP=========");
        System.out.println(names);

        // Nested class in employees: Long way and using FlatMap
        List<List<String>> projectNames = employees.stream().map(employee -> employee.getProjects().stream().map(Project::getName).toList()).toList();
        System.out.println(projectNames);

        List<String> projectNamesFlatMap = employees.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .map(Project::getName).toList();
        System.out.println(projectNamesFlatMap);

        System.out.println("==========MAP END===========");

        // Sorted
        List<Double> sortedSal = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary)
                .toList();
        System.out.println("Sorted according to salary: " + sortedSal);

        List<Double> descSortedSal = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .map(Employee::getSalary)
                .toList();
        System.out.println("Salary sorted in desc order: " + descSortedSal);

        // Min & Max
        Optional<Employee> highestPaidEmployee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> lowestPaidEmployee = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest Paid:: " + highestPaidEmployee.get());
        System.out.println("Lowest Paid:: " + lowestPaidEmployee.get());

        // GroupingBy
        Map<String, List<Employee>> groupByGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println("Group by gender:: ");
        groupByGender.forEach((key, value) -> System.out.println(key + " : " + value.stream().map(Employee::getName).toList()));

        // Same work as above groupingBy
        Map<String, List<String>> groupByGenderOpt = employees.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("Optimized group by gender:: ");
        groupByGenderOpt.forEach((key, value) -> System.out.println(key + " -> " + value));

        // counting people of each gender
        Map<String, Long> groupByGenderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Group by gender count:: " + groupByGenderCount);

        // findFirst
        Employee findFirstEmp = employees.stream().filter(emp -> emp.getDept().equals("Development"))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
        System.out.println("Find First:: " + findFirstEmp);

        // findAny: most useful in parallel streams
        Employee findAnyEmp = employees.stream().filter(emp -> emp.getDept().equals("Development"))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
        System.out.println("Find Any:: " + findAnyEmp);

        // anyMatch(predicate), allMatch(predicate), noneMatch(predicate)
        boolean isHr = employees.stream()
                .anyMatch(employee -> employee.getDept().equals("HR"));
        System.out.println("Is there any department of HR? " + isHr);

        boolean isSalEnough = employees.stream()
                .allMatch(employee -> employee.getSalary() > 50000);
        System.out.println("Does all employee have salary greater than 50000? " + isSalEnough);

        boolean isNoDept = employees.stream()
                .noneMatch(employee -> employee.getDept().equals("NoDept"));
        System.out.println("Does none of the employee match NoDept? " + isNoDept);

        // limit
        List<Employee> top3paidEmp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .toList();
        System.out.println("Top 3 paid employees: " + top3paidEmp);

        // skip: used in pagination -- when you want business logic to handle it and not database
        List<Employee> skip = employees.stream()
                .filter(employee -> employee.getDept().equals("Development"))
                .skip(2)
                .toList();
        System.out.println("Using skip: " + skip);

    }
}
