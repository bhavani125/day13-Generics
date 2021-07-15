package com.max;

public class Maximum {
    //main method
    public static void main(String[] args) {
        Float x = 3.6f;
        Float y = 4.8f;
        Float z = 5.9f;
        findMaximum(x,y,z);

    }
    //Creating method for findMaximum
    private static void findMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(x)>0) {
            max = y;
        }
        if (z.compareTo(max)>0) {
            max = z;
        }
        System.out.println("Maximum of numbers are " +max);

    }

}