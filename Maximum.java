package com.max;
//creating class as generic
public class Maximum <E extends Comparable<E>> {
    //creating 3 generic type variables
    E num1;
    E num2;
    E num3;
    public Maximum(E num1, E num2, E num3) {
        super();
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    // main method
    public static void main(String[] args) {
        System.out.println("Maximum Integer by using Generic class :" + new Maximum(2, 4, 6).FindMax());
        System.out.println("Maximum Float by using Generic class :" + new Maximum(1.1, 2.2, 3.3).FindMax());
        System.out.println("Maximum String by using Generic class :" + new Maximum("apple","peach","banana").FindMax());
    }
    // generic method
    public E FindMax() {
        return Maximum.findMax(num1, num2, num3);
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
