/*
Write a Java program to sum values of an array.
 */

package javaprograms;

import java.util.Arrays;

public class Question21 {
    public static void main(String[] args) {
        sumofvalues();
    }
    public static void  sumofvalues(){
        int [] number = {2802,810,1102,1505,1012,       //single dimensional array
                        1995,2001,1964,1992,1969};
        int sum = Arrays.stream(number).sum();             //sum of array
        System.out.println("Sum of the array is: " + sum);
    }
}
