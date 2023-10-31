/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
 */

package javaprograms;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        positiveornegativeorzero();
    }
    public static void positiveornegativeorzero(){
        Scanner scan = new Scanner(System.in);  //Scanner Class
        System.out.println("Enter a number to test:");
        int number = scan.nextInt();
        if(number>0){                       //if else condition
            System.out.println("The number is Positive");
        }
        else if (number<0) {
            System.out.println("The number is Negative");
        }
        else if (number==0) {
            System.out.println("The number is Zero");
        }
    }
}
