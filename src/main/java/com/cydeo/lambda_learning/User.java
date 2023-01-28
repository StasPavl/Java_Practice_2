package com.cydeo.lambda_learning;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@Getter              |
@Setter              |    CAN WRITE ONLY @DATA
@ToString            |
*/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
