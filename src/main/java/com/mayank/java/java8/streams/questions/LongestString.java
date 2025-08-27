package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
        List<String> stringList = GetData.getStringList();
        System.out.println(stringList);

        stringList.stream()
                .max(Comparator.comparingInt(String::length))
//                .max((a,b) -> Integer.compare(a.length(), b.length()))
                .ifPresent(System.out::println);
    }
}
