/*
Write a java program to get numbers from users and print whether it is positive or negative.
 */

package javaprograms;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        positiveornegative();
    }
    public static void positiveornegative(){
        Scanner scan = new Scanner(System.in);  //Scanner Class
        System.out.println("Enter a number to test:");
        int number = scan.nextInt();
        String result = (number >= 0) ? "Positive" : "Negative";  //Ternary Operator
        System.out.println(number + " is " + result);
    }
}
