package com.cydeo.constractor_reference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero Arguments Constructor---------------------------------------------

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getMake());

        Supplier<Car> c2 = Car ::new;
        System.out.println(c2.get().getModel());

        //One Argument Constructor-----------------------------------------------

        Function<Integer,Car> f1 = model -> new Car(model);
        System.out.println(f1.apply(2));
        Function<Integer,Car> f2 = Car::new;

        //Two Argument Constructor-----------------------------------------------

        BiFunction<String,Integer,Car> b1 = Car::new;
        System.out.println(b1.apply("Dodge", 392));

        BiFunction<String,Integer,Car> b2 = (str, i) -> new Car(str,i);

        //****!!!One or Two or Three or No Argument Constructor calling depends of prebuild functional interfaces!!!!****



    }
}
