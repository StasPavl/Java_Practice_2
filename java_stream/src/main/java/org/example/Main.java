package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        //Creating Stream from Array-------------------------------------------

        String[] courses = {"Java","Spring","Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

        //Creating Stream from Collection--------------------------------------

        List<String> courseList = Arrays.asList("Java","Spring","Agile");

        Stream<String> courseStream2 = courseList.stream();

        //Creating Stream from th Class--------------------------------------

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102)
        );
        Stream<Course> myCoursesStream = myCourses.stream();


    }
}
