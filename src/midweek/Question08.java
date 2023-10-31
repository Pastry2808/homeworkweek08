/*
A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student allowed to sit in exam or not.
 */
package midweek;
import java.util.Scanner;
public class Question08 {
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
        if (percentageOfClassesAttended >= 75){
            System.out.println("You are allowed to sit in the exam.");
        }
        else{
            System.out.println("Your attendance is low. You are not allowed to sit in the exam.");
        }
    }
}
