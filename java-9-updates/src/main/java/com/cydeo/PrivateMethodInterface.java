package com.cydeo;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);


    default  boolean isBusinessDay(LocalDate date){
        validate(date);
       return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date) {
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }

    //Private method
    private void validate(LocalDate date){
        if (date.isBefore((LocalDate.of(2001,1,1)))){
            throw new IllegalArgumentException();
        }
    }

}
