package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

       Predicate<Integer> pred =  (p) -> p % 2 ==0 ? true : false; //its implementation of abstract method in functional interface

        //***************************************************************

        Calculate sum = (x,y) -> System.out.println(x+y);//lambda expression from Calculate interface
        //im writing implementation from abstract method in interface

        Calculate sum1 = (x,y) -> Calculator.findSum(x,y);

        //reference to Static Method--------------------------------
        Calculate sum2 = Calculator::findSum;

        sum2.calculate(10,20);

        //Reference to Instance Methods-----------------------------
        Calculator obj = new Calculator();

        Calculate s3 = (x,y) -> System.out.println(x*y);

        Calculate s4 = obj::findMultiply; // or Calculate s4 = new Calculator() :: findMultiply;
        s4.calculate(2,2);
        //************************************************************
        // i can use method reference cuz my lambda refer to method
        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);

        BiFunction<String,Integer,String> func1 = String::substring;
        Function<Integer,Double> m1 = new MyClass()::method;

        BiFunction<MyClass,Integer,Double> m2 = MyClass::method;

        Consumer<Integer> display1 = i -> System.out.println(i);
        Consumer<Integer> display = System.out::println;













    }
}
