package org.example;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,6,9);

        int sum = 0;

        for (Integer number : numbers) {
            sum = sum + number;
        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);

        System.out.println(sum);
        System.out.println(result);


        Integer integer = numbers.stream().reduce(Integer::min).get();
        Integer integer1 = numbers.stream().reduce(Integer::max).get();
        Integer integer2 = numbers.stream().reduce(Integer::sum).get();

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);

    }
}
