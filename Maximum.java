package com.max;

public class Maximum {
    //main method
    public static void main(String[] args) {
        findMax(4,6,8);
        findMax(1.1,1.2,1.3);
        findMax("apple","peach","banana");
    }

    public static <E extends Comparable <E>> E findMax(E num1, E num2, E num3) {

        E max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.printf("Maximum of numbers are " + max +"\n");
        return max;
    }

}
