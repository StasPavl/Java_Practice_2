package org.example;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>02) ? -1 : (o1<o2) ? 1 : 0;
    }
}
