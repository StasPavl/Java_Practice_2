package com.cydeo;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        /**
         * Its mean READ ONLY
         * You can use it, but you can not modify
         */

        //Creating unmodifiable LIst before Java 9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));

        //courses.add("TS"); give you exception
        System.out.println(courses);

        //Creating unmodifiable List after Java 9
        List<String> myCourses = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set after Java 9
        Set<String> myProducts = Set.of("Milk","Bread","Butter");

        //Creating unmodifiable Map after JAva 9
        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsunt Tv", 1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );
    }
}
