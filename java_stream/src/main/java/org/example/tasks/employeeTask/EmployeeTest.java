package org.example.tasks.employeeTask;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {


        System.out.println("--PRINT ALL EMAIL--");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("--------------------");

        System.out.println("--PRINT ALL PHONE NUMBERS--");

        EmployeeData.readAll()
                .flatMap(x-> x.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("--PRINT ALL PHONE NUMBERS WITH DOUBLE COLONS--");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
