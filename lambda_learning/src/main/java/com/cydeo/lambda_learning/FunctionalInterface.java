package com.cydeo.lambda_learning;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        System.out.println("*************************PREDICATE************************");
        // except object return boolean
        // boolean TEST(Object  obj){} ---> its how looks method inside the interface

        Predicate<Integer> lesserThen = i -> i < 18;
        System.out.println(lesserThen.test(5));

        System.out.println("*************************CONSUMER************************");
        // except object do not return anything
        // void ACCEPT(Object  obj){} ---> its how looks method inside the interface

        Consumer<Integer> display = integer -> System.out.println(integer);
        display.accept(10);


        System.out.println("*************************BI CONSUMER************************");
        // except two object do not return anything
        // void ACCEPT(Object  obj , Object obj){} ---> its how looks method inside the interface

        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("*************************FUNCTION************************");
        // except first object and return second
        // object APPLY(Object obj){} ---> its how looks method inside the interface
        Function<Integer,String > fun = s -> "Hello " + s;
        System.out.println(fun.apply(2));

        System.out.println("*************************BI FUNCTION************************");
        //except first and second arguments and return third
        //object APPLY (object obj, Object obj){}---> its how looks method inside the interface
        //Params:
        //t – the first function argument
        //u – the second function argument
        //Returns:
        //r - the function result

        BiFunction<Integer,Integer,Integer> func = (t,u) -> t+u;
        System.out.println(func.apply(1,2));

        System.out.println("*************************SUPPLIER************************");
        //do not accept anything return Object
        //object GET (){} ---> its how looks method inside the interface
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());






    }
}
