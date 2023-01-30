package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        Comparator<Apple> sortApple = Comparator.comparing(Apple::getWeight);
        inventory.sort(sortApple);
        System.out.println(inventory);

    }
}
