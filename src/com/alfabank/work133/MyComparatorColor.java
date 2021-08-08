package com.alfabank.work133;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1.getColor().compareTo(shape2.getColor());
    }
}
