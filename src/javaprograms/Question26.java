/*
Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */
package javaprograms;
public class Question26 {
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse() {
        String name = "Khushbu";
        char[] resultarray = name.toCharArray();
        int i;
        System.out.println(name);
        for (i = resultarray.length - 1; i >= 0; i--) {         //For Loop

            System.out.print(resultarray[i]);
        }
    }
}
