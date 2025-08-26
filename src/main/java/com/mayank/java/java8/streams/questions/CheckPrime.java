package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;
import java.util.stream.IntStream;

public class CheckPrime {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();

        boolean anyPrime = list.stream()
                .anyMatch(CheckPrime::isPrime);

        System.out.println("Prime present? " + anyPrime);

        System.out.println("Which are the prime present? ");
        list.stream()
                .filter(CheckPrime::isPrimeStream)
                .forEach(n -> System.out.print(n + ", "));
    }

    public static boolean isPrimeStream(int num) {
        if(num <= 1)
            return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(num))
                .noneMatch(i -> num % i == 0);
    }

    public static boolean isPrime(int num) {
        if(num <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
