package com.cydeo.lambda_learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Mike","Smith", 35));
        users.add(new User("Tom","Evan", 17));
        users.add(new User("Mike","Pellars", 20));
        users.add(new User("Stan","Pavlovskyi", 29));


        //Print all element in the list
        printName(users, user -> true);
        System.out.println("-------------------------------");


        //Print all people that last name starts with E    -> Predicate
        printName(users, user -> user.getLastName().startsWith("E"));

        //Write method and use ready interfaces




    }
    public static void printName (List<User> list , Predicate<User> p){
        for (User user : list) {
            if (p.test(user)){

                System.out.println(user.toString());
            }
        }
    }
}
