/*
Write a java program to input any number and find out if it’s odd or even.
 */

package javaprograms;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        oddoreven();
    }
    public static void oddoreven(){
        Scanner scan = new Scanner(System.in);  //Scanner Class
        System.out.println("Enter number to test");
        int number = scan.nextInt();
        String result = (number%2==0) ? "Even" : "Odd";  //Ternary Operator
        System.out.println(number +" is "+ result);
    }
}
