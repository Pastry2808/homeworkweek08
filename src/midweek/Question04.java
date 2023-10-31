/*
Take values of length and breadth of a rectangle from user and check if it is square or not.
 */

package midweek;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Question04 shape = new Question04();
        shape.rectangle();
    }
    public void rectangle(){
        Scanner square = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = square.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = square.nextDouble();
        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
