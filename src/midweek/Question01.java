/*
Take 10 integers from keyboard using loop and print their average value on the
screen.
 */

package midweek;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        average();
    }
    public static void average(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg;
        for (int i=1; i<=10; i++ ) {
            System.out.println("Enter a number ");
            sum = sum + sc.nextInt();
            avg = sum/10d;
            System.out.println("Avg is : "+ avg);
        }
    }
}
