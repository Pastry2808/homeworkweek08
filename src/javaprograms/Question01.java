/*
Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)
 */

package javaprograms;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //Scanner Class
        System.out.println("Enter number to test");
        int number = scan.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";  //Ternary Operator
        System.out.println(number + " is " + result);
    }
}
