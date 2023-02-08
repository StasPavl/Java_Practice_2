package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {
        /**
         * method .lines()
         * convert every lines in String to Stream
         */

        var str = "Mike \nOzzy \nTom \nEmmy";

        str.lines().forEach(System.out::println);

    }
}
