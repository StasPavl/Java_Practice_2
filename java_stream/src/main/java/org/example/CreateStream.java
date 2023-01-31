package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {
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

        //Creating Stream Values

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

        List<Integer> collect = stream.filter(s -> s > 2)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
