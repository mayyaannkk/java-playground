package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetElementsAs;

import java.util.List;

public class SumUnique {
    public static void main(String[] args) {
        List<Integer> list = GetElementsAs.getList();
        System.out.println(list);

        int sum = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
    }
}
