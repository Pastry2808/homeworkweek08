/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
other alphabet should be invalid entry.
 */

package javaprograms;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Question11 printcitynames = new Question11();       //Object
        printcitynames.citynames();
    }
    public void citynames() {
        Scanner sc = new Scanner(System.in);            //Scanner Class
        System.out.println("Enter character between A to F : " );
        char city = sc.next().charAt(0);
        if(city == 'A'){                            //if else condition
            System.out.println("Ahmedabad");
        }
        else if (city == 'B') {
            System.out.println("Bombay");
        }
        else if (city == 'C') {
            System.out.println("Chattisgadh");
        }
        else if (city == 'D'){
            System.out.println("Dakor");
        }
        else if (city == 'E'){
            System.out.println("Edinburgh");
        }
        else if (city == 'F'){
            System.out.println("Faridabad");
        }
        else {
            System.out.println("Invalid Entry");
        }

    }
}
