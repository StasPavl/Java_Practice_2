package org.example;

import org.example.tasks.dishTask.Dish;
import org.example.tasks.dishTask.DishData;
import org.example.tasks.dishTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("---------TO COLLECTION-----------");

        // is used to create a Collection using Collection

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        System.out.println("---------TO LIST-----------");

        //toList(); return a Collector interface that gathers the input data into new list

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("---------TO SET-----------");
        //toSET(); return a Collector interface that gathers the input data into new SET

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("---------TO MAP-----------");

        //toMap(Function,Function) return Collector Interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.getAll().stream()

               // .collect(Collectors.toMap(x -> x.getName(), y -> y.getCalories()));

                       .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        System.out.println("---------SUMMING INT-----------");
        //summingInt(ToIntFunction) returns a Collector that produce the sum of Integer values func

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("---------COUNTING-----------");
        //return a Collector that counts the number of the elements

        Long elementCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(elementCount); // evan numbers

        System.out.println("---------AVERAGING INT-----------");

        //returns the avarage of the integers passed value

        Double avarageOfCallories = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(avarageOfCallories);

        System.out.println("---------JOINING-----------");
        //is used to join various elements of a character or string array into a single object

        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("---------PARTITIONING BY-----------");
        //is used to partition a stream of objects(or a set of elements) based on a given prdicate.

        Map<Boolean, List<Dish>> isVegeterian = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(isVegeterian);


        System.out.println("---------GROUPING BY-----------");
        //is used for grouping objects by some properties and storying results in Mao instance

        Map<Type, List<Dish>> grooupingVeggieDish = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(grooupingVeggieDish);


    }
}
