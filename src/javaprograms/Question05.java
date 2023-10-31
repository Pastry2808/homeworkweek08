/*
Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

package javaprograms;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Question05 result = new Question05();
        result.marksheet();
    }
    public void marksheet(){
        Scanner marks = new Scanner(System.in);         //Scanner Class
        System.out.println("Enter Student Name: ");
        String studentName = marks.nextLine();
        System.out.println("Enter Student RollNo: ");
        int rollno = marks.nextInt();
        System.out.println("Enter Mathematics Marks: ");
        int maths = marks.nextInt();
        System.out.println("Enter Science Marks: ");
        int science = marks.nextInt();
        System.out.println("Enter English Marks: ");
        int english = marks.nextInt();
        int total = (maths + science + english);
        System.out.println("Total = " + total);
        int percentage = (total/3);
        System.out.println("Percentage = " + percentage + "%");
        if (percentage>=80) {                                       //if else condition
            System.out.println("Grade: A+ Pass");
        }
        else if (percentage>=60) {
            System.out.println("Grade: A Pass");
        }
        else if (percentage>=50) {
            System.out.println("Grade: B Pass");
        }
        else if (percentage>=35) {
            System.out.println("Grade: C Pass");
        }
        else if (percentage<35) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid Input");
        }
        System.out.println("+-------------------------------+");
        System.out.println("|           MARKSHEET           |");
        System.out.println("| Enter Student Name: " +studentName+"   |");
        System.out.println("| Enter Student RollNo: " +rollno+"      |");
        System.out.println("|-------------------------------|");
        System.out.println("| Enter Mathematics Marks: " +maths+"   |");
        System.out.println("| Enter Science Marks: " +science+"       |");
        System.out.println("| Enter English Marks: " +english+"       |");
        System.out.println("|-------------------------------|");
        System.out.println("| Total = " + total+"                   |");
        System.out.println("| Percentage = " + percentage + "%" +"              |");
        System.out.println("+-------------------------------+");


    }
}
