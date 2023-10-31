/*
Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)
 */

package javaprograms;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Question13 expressions = new Question13();      //Object
        expressions.maths();
    }
    public void maths(){
        Scanner number = new Scanner(System.in);        //Scanner Class
        System.out.println("Enter the First Number: ");
        int number1 = number.nextInt();
        System.out.println("Enter the Second Number: ");
        int number2 = number.nextInt();
        System.out.println("Enter the Operator you want to use out of (+,-,/,*): ");
        char operator = number.next().charAt(0);
        int Answer = 0;
        if (operator == '+') {                      //if else condition
            Answer = number1 + number2;
        }
        else if (operator == '-') {
            Answer = number1 - number2;
        }
        else if (operator == '/') {
            Answer = number1 / number2;
        }
        else if (operator == '*') {
            Answer = number1 * number2;
        }
        else{
            System.out.println("Invalid Operator");
        }
        System.out.println("Your answer is: " + Answer);
    }

    }
