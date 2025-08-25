package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetElementsAs;

import java.util.List;

public class LastElement {
    public static void main(String[] args) {
        List<Integer> list = GetElementsAs.getList();

        System.out.println(list);
        list.stream()
                .skip(list.size() - 1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
