package com.max;

import java.util.Scanner;

public class Maximum {
    static Scanner sc = new Scanner(System.in);
    //main method
    public static void main(String[] args) {
        System.out.println("Enter 1)To find maximum of Integers\n 2)To find maximum of Float number\n 3)To find maximum of String");
        System.out.print("Enter option : ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a size of Integer array: ");
                int size = sc.nextInt();
                //Creating object
                Integer[] integersArray = new Integer[size];
                integersArray = printInteger(integersArray, size);
                Integer integerMax = findIntegerMax(integersArray);
                System.out.println("Maximum integer value is :" + integerMax);
                break;
            case 2:
                System.out.println("Enter a size of float array: ");
                size = sc.nextInt();
                Float[] floatsArray = new Float[size];
                floatsArray = printFloat(floatsArray, size);
                Float floatMax = findFloatMax(floatsArray);
                System.out.println("Maximum float number is :" + floatMax);
                break;
            case 3:
                System.out.println("Enter a size of String array: ");
                size = sc.nextInt();
                String[] stringsArray = new String[size];
                stringsArray = printString(stringsArray, size);
                String stringMax = findStringMax(stringsArray);
                System.out.println("Maximum String is :" + stringMax);
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
    //creating method for  printInteger
    private static Integer[] printInteger(Integer[] integersArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            integersArray[i] = sc.nextInt();
        }
        return integersArray;
    }

    //creating method for  printFloat
    public static Float[] printFloat(Float[] floatsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            floatsArray[i] = sc.nextFloat();
        }
        return floatsArray;
    }
    //creating method for  printString
    public static String[] printString(String[] stringsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            stringsArray[i] = sc.next();
        }
        return stringsArray;
    }

    //creating method for  findIntegerMax
    private static Integer findIntegerMax(Integer[] integers) {
        Integer max = integers[0];
        for (Integer i : integers) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }
    //creating method for  findFloatMax
    public static Float findFloatMax(Float[] floats) {
        Float max = floats[0];
        for (Float i : floats) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }
    //creating method for  findStringMax
    public static String findStringMax(String[] strings) {
        String max = strings[0];
        for (String i : strings) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;

    }
}
