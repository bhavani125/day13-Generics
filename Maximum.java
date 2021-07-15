package com.max;

public class Maximum {
    //main method
    public static void main(String[] args) {
        String l = "apple";
        String m = "peach";
        String n = "banana";
        findMaximum(l,m,n);
    }

    //Creating method for findMaximum
    private static void findMaximum(String l, String m, String n) {
        String max = l;
        if (m.compareTo(l)>0) {
            max = m;
        }
        if (n.compareTo(max)>0) {
            max = n;
        }
        System.out.println("Maximum of numbers are " +max);
    }
}