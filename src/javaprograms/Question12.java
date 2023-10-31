/*
Same as above program-8 using switch statement.
 */

package javaprograms;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Question12 printcitynames = new Question12();  //Object
        printcitynames.city();
    }
    public static void city(){
        Scanner sc = new Scanner(System.in);            //Scanner Class

        System.out.println("Enter character between A to F : " );
        String city = sc.next();

        switch (city){                      //Switch Condition
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Chattisgadh");
                break;
            case "D":
                System.out.println("Dakor");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

}
