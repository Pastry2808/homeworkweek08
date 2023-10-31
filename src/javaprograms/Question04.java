/*
Write if else condition and print your group name in console else others group name.
 */

package javaprograms;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Question04 name = new Question04();         //Object
        name.groupname();                           //Called Instance Method using Object
    }
    public void groupname() {
        Scanner group = new Scanner(System.in);        //Scanner Class
        System.out.println("Enter a number between 1 to 5: ");
        int groupname1 = group.nextInt();
        if (groupname1 == 1) {                          //if-else conditional statement
            System.out.println("AGILE");
        } else if (groupname1 == 2) {
            System.out.println("RESTASSURED");
        } else if (groupname1 == 3) {
            System.out.println("CODE1");
        } else if (groupname1 == 4) {
            System.out.println("CODE2");
        } else if (groupname1 == 5) {
            System.out.println("JAVA");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}