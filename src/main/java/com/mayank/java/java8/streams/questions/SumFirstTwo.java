package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;
import java.util.Optional;

public class SumFirstTwo {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();
        System.out.println(list);

        int sum = list.stream()
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        Optional<Integer> reduceSum = list.stream()
                .limit(2)
                .reduce((a, b) -> a + b);
        System.out.println("Reduce Sum: " + reduceSum.get());
    }
}
