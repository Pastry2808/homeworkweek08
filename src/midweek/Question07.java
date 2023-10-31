/*
Take input of age of 3 people by user and determine oldest and youngest among
them.
 */

package midweek;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        System.out.println("Enter the age of the first person: ");
        Scanner age = new Scanner(System.in);
        int person1 = age.nextInt();
        System.out.println("Enter the age of the second person: ");
        int person2 = age.nextInt();
        System.out.println("Enter the age of the third person: ");
        int person3 = age.nextInt();
        int oldestPerson = oldest(person1, person2, person3);
        int youngestPerson = youngest(person1, person2, person3);
        System.out.println("Oldest Person is: " + oldestPerson);
        System.out.println("Youngest Person is: " + youngestPerson);
    }
    public static int oldest(int age1, int age2, int age3){
        return (Math.max(Math.max(age1, age2), age3));
    }
    public static int youngest(int age1, int age2, int age3){
        return (Math.min(Math.min(age1, age2), age3));
    }
}
