package org.example;

import org.example.tasks.dishTask.DishData;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("-----ALL MATCH------");

        boolean isHealthy = DishData.getAll().stream().allMatch(x -> x.getCalories()<1000);
        System.out.println(isHealthy);
    }
}
