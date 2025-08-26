package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();

        List<Integer> sorted = list.stream().sorted().toList();

        System.out.println("Original: " + list);
        System.out.println("Sorted: " + sorted);

    }
}
