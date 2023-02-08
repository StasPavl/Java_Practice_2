package com.cydeo;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {
    public static void main(String[] args) {

        /**
         * Modularity in Java its ENCAPSULATION of packages in JAVA
         */

        System.out.println(String.class.getModule());
        System.out.println(Scanner.class.getModule());
        System.out.println(List.class.getModule());
    }
}
