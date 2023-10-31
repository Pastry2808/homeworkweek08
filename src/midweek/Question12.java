/*
Write a program to find the length of the string "refrigerator".
 */

package midweek;

public class Question12 {
    public static void main(String[] args) {
       Question12 lengthofword = new Question12();
       lengthofword.length();
    }
    public void length(){
        String string = "refrigerator";
        int wordLength = string.length();
        System.out.println("Length of the word is: " + wordLength);
    }
}
