/*
Write a program to print a string entered by user.
 */

package midweek;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Question11 userstring = new Question11();
        userstring.printString();
    }
    public void printString(){
        System.out.println("Enter a String: ");
        Scanner string = new Scanner(System.in);
        String name = string.nextLine();
        System.out.println("Printed String: " + name);
    }
}
