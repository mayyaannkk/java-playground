package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;

public class NSmallest {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();
        int nth = 3;

        System.out.println(list);
        list.stream()
                .sorted()
                .skip(nth - 1)
                .findFirst().ifPresent(System.out::println);
    }
}
