package org.example.tasks;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        //NEED TO COUNT CHARACTER OF EACH STRING

        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
