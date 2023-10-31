/*
Write a Java program to calculate the average value of array elements.
 */

package javaprograms;

import java.util.Arrays;

public class Question22 {
    public static void main(String[] args) {
       averageofvalues();
    }
    public static void  averageofvalues(){
        int [] number = {2802,810,1102,1505,1012};      //single dimensional array
        int sum = Arrays.stream(number).sum();
        int length = number.length;
        double average = (sum/length);
        System.out.println("Average of the array is: " + average);      //average of array
    }
}
