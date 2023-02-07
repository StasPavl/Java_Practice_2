package com.cydeo.optional_learning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());

        //System.out.println(empty.get());

        //ifPresent -> if null do not give exception

        Optional<Integer> bigNumber = number.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get -> if null give us exception
        //System.out.println(bigNumber.get());

        //orElse -> if null give us default option
        System.out.println(bigNumber.orElse(5));
    }
}
