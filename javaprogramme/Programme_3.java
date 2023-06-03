package javaprogramme;
/** Write a Java program to reverse an array of integer values.*/

import java.util.Arrays;
import java.util.Collections;

public class Programme_3 {
    public static void main(String[] args) {
        Integer[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Modified Array : " + Arrays.toString(arr));
    }
}
