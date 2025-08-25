package com.mayank.java.java8.streams.questions;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        /*
         since we need to check if the first char, and last char are equal or not
         similarly we need to make the first pointer bigger, and the last pointer smaller
         */
        boolean isPalindrome = IntStream.rangeClosed(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

        System.out.println("Is palindrome? " + isPalindrome);
    }
}
