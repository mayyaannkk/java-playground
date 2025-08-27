package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;

public class MultiplyEach {
    public static void main(String[] args) {
        List<Integer> list = GetData.getIntegerList();

        List<Integer> mul = list.stream()
                .map(element -> element * 2)
                .toList();

        System.out.println("Input: " + list);
        System.out.println("Multiplied by 2: " + mul);
    }
}
