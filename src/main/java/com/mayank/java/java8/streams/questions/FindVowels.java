package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindVowels {
    public static void main(String[] args) {
        String sentence = "I have an apple and orange on the table";
        int k = 2;

        Arrays.stream(sentence.split(" "))
                .filter(word -> countVowels(word) == k)
                .forEach(System.out::println);
    }

    public static long countVowels(String word){
        return word.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();
    }
}
