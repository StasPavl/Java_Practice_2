package com.cydeo.java13;

public class TextBlocksDemo {
    public static void main(String[] args) {
        /**
         * Text Block using with """ TEXT """
         * easy to read text inside the code
         */


        var address = "7925 Jones Branch Drive \n " +
                "McLean, Va 22102";

        var address2  = """
    7925 Jones Branch Dr
    McLean, Va 22102
    """;
        System.out.println(address);

        System.out.println(address2);

    }
}
