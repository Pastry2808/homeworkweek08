/*
Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */

package midweek;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        attendance();
    }
    public static void attendance(){
        Scanner classes = new Scanner(System.in);
        System.out.println("Enter the number of classes held: ");
        int noOfClasses = classes.nextInt();
        System.out.println("Enter the number of classes attended: ");
        int noOfClassesAttended = classes.nextInt();
        double percentageOfClassesAttended = (noOfClassesAttended * 100)/noOfClasses;
        System.out.println("Percentage of classes attended: " + percentageOfClassesAttended + "%");
        System.out.println("Do you have a medical cause: ");
        char cause = classes.next().charAt(0);
        if ((cause == 'Y') || (percentageOfClassesAttended >= 75)){
            System.out.println("You are allowed to sit in the exam.");
        }
        else {
                System.out.println("Your attendance is low. You are not allowed to sit in the exam.");
            }
        }
    }

