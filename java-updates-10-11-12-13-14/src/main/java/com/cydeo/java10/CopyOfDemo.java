package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {

        /**
         * Create Copy of Collection but making it unmodifiable
         */

        List<Integer> numberList = Arrays.asList(2,4,6,8);

        List<Integer> unmodifiableList = List.copyOf(numberList);

    }
}
