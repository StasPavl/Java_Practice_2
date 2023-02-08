package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {

        /**
         * Its replacement of .get()
         * .get() can give you Exception if No Such Element and will stop your code
         */

        Optional<String> str = Optional.empty();
        System.out.println(str.get()); // give us exception

        if (str.isPresent()){
            System.out.println(str.get());
        }else{
            //exception handling
        }

        System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(() -> new RuntimeException()));
    }
}
