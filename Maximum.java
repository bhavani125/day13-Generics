package com.max;

public class Maximum {
    //main method
    public static void main(String[] args) {
        Integer a=2;
        Integer b=4;
        Integer c=6;
        findMaximum(a,b,c);
    }
    //creating method for findMaximum
    private static void findMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a)>0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        System.out.println("Maximum of numbers are " +max);
    }
}