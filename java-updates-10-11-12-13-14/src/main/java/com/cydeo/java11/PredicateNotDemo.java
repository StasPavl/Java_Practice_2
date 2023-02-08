package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class PredicateNotDemo {
    public static void main(String[] args) {
        /**
         * The Predicate.not() static method has been added to Java 11 in order to negate an existing Predicate.
         */

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even = integer -> integer % 2 ==0;
        Predicate<Integer> odd = integer -> integer % 2 !=0;
        Predicate<Integer> predicateNotOdd = not(even);

        List<Integer> evenNumbers = list.stream()
                .filter(even)
                .collect(Collectors.toList());
        List<Integer> oddNumbers = list.stream()
                //filter(predicateNotOdd)
                .filter(Predicate.not(even))
                .collect(Collectors.toList());


    }
}
