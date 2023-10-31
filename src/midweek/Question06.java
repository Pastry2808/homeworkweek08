/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
package midweek;
import java.util.Scanner;
public class Question06 {
    public static void main(String[] args) {
        Question06 gradingsystem = new Question06();
        gradingsystem.grade();
    }
    public void grade(){
        Scanner grading = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = grading.nextInt();
        if (marks < 25){
            System.out.println("Corresponding Grade is F");
        }
        else if (marks >= 25 && marks <= 45) {
            System.out.println("Corresponding Grade is E");
        }
        else if (marks >= 45 && marks <= 50) {
            System.out.println("Corresponding Grade is D");
        }
        else if (marks >= 50 && marks <= 60) {
            System.out.println("Corresponding Grade is C");
        }
        else if (marks >= 60 && marks <= 80) {
            System.out.println("Corresponding Grade is B");
        }
        else if (marks > 80 && marks <= 100) {
            System.out.println("Corresponding Grade is A");
        }
        else {
            System.out.println("Invalid Entry. Enter marks between 0 to 100");
        }
    }
}
