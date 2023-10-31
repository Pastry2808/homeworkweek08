/*
Write a program to print the sum of two numbers entered by user by defining your
own method.
 */
package midweek;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
      khushbu();
    }
    public static void khushbu(){
        Scanner addition = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = addition.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = addition.nextDouble();
        double sum = num1 + num2;
        System.out.println("Addition of both numbers is: " + sum);

    }

}
