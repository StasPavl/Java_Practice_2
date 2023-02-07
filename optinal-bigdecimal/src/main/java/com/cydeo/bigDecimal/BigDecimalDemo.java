package com.cydeo.bigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1-amount2); //0.3000000001137

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.valueOf(374.26);
        BigDecimal b5 = BigDecimal.TEN;
        BigDecimal b6 = BigDecimal.ONE;

        System.out.println(b1.subtract(b2));//0.30
        System.out.println(b3.subtract(b4));
        System.out.println(b5.add(b6));



    }
}
