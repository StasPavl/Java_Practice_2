package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("---------TO COLLECTION-----------");

        // is used to create a Collection using Collection

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

    }
}
