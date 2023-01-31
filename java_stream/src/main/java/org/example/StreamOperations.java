package org.example;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(System.out::println);
        System.out.println("*******************************");



        System.out.println("--------FILTER-----------");

        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        numbers.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("*******************************");

        System.out.println("--------DISTINCT-----------");

        numbers.stream()
                .filter(i -> i%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("*******************************");

        System.out.println("--------LIMIT-----------");

        numbers.stream()
                .filter(i -> i % 2 ==0)
                .distinct()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("*******************************");

        System.out.println("--------SKIP-----------");

        numbers.stream()
                .filter(i -> i % 2 ==0)
                .distinct()
                .skip(1)
                .forEach(System.out::println);
        System.out.println("*******************************");
    }
}
