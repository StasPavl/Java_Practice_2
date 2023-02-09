package com.cydeo.java14;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        var month = 2;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("February can have 28 or 29 days");
                break;
            default:
                System.out.println("invalid month");
        }

        System.out.println("*******************");

        /**
         * After Java 14 you can write your switch case statements in this format and you dont need break keyword;
         * And you can assign you switch statement to variable such as |int day|
         */

        switch(month){
            case 1,3,5,7,8,10,12 -> System.out.println("This month has 31 days");
            case 4,6,9 ->System.out.println("This month has 30 days");
            case 2 -> System.out.println("This month has 28 or 29 days");
            default -> System.out.println("Invalid month");

        }
        System.out.println("*******************");

        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                throw new IllegalArgumentException("Invalid month");
        }


        int day1 = switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9 -> 30;
            case 2 -> 29;
            default -> 0;
        };

        System.out.println(day1);


        int day2 = switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9 -> 30;
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter year");
                int year = scanner.nextInt();

                if (year % 4 == 0){
                    yield 29;
                }else {
                    yield 28;
                }
            }
            default -> 0;
        };

        System.out.println(day2);
    }
}
