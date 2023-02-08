package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        /**
         * Only for Local variables
         * we can not use this variables for constance variables
         * Local variables MUST be initialize at time of declaration;
         */

        //Type Inference

        String abc = "Cydeo";

        var str = "Cydeo";
        var numbers = 5;


        /**
         * compiler understand only as an Integer
         */
        byte x = 1;
        var y = 1;

        var listOfNumbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for (var each : listOfNumbers){
            sum = sum+each;

        }
    }
}
