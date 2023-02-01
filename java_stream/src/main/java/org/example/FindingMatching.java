package org.example;

import org.example.tasks.dishTask.Dish;
import org.example.tasks.dishTask.DishData;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("-----ALL MATCH------");

        //return boolean!!!!

        boolean isHealthy = DishData.getAll().stream().allMatch(x -> x.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("-----ANY MATCH------");

        //return boolean!!!!

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("-----NONE MATCH------");

        //return boolean!!!!

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("-----FIND ANY------");

        //return OPTIONAL Object

        Optional<Dish> anyVegetarianDish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(anyVegetarianDish.get());

        System.out.println("-----FIND FIRST------");

        //return OPTIONAL Object

        Optional<Dish> firstVegetarianDish = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(firstVegetarianDish.get());

        //PARALLEL STREAMS(Async)
        System.out.println(IntStream.range(0,100).parallel().findAny().getAsInt());
        System.out.println(IntStream.range(0,100).parallel().findFirst().getAsInt());


    }
}
