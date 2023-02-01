package org.example.tasks.employeeTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100,"Mike","mile@cydeo.com", Arrays.asList("20222323434","3013331866")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("433223443434","2023331866")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("72022923434","8013331866"))
        );
    }
}
