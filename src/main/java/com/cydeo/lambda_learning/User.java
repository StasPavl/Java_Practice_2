package com.cydeo.lambda_learning;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
