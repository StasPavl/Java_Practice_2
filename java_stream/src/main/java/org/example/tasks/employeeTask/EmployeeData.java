package org.example.tasks.employeeTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("202-232-34-34","301-300-18-66")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("433-244-34-34","202-333-90-66")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("720-229-23-44","801-322-18-76"))
        );
    }
}
