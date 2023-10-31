/*
Take two int values from user and print greatest among them.
 */
package midweek;
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        max();
    }
    public static void max(){
        Scanner maximum = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = maximum.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = maximum.nextDouble();
        double value = Math.max(number1, number2);
        System.out.println(value + " is greater");
        }
    }

