/*
Write a Java program to sort a numeric array and a string array.
 */
package javaprograms;
import java.util.Arrays;
public class Question20 {
    public static void main(String[] args) {
        Question20 sort = new Question20();  //Object
        sort.sortingarrays();  //Called Instance Method using Object
    }
    public void sortingarrays() {
        String[] places = {"India", "Delhi",           //Multi-dimensional Array
                            "Australia", "Sydney",
                            "USA", "Washington",
                            "Canada", "Ottawa",
                            "UK", "London"};
        int [] birthdays = {2802,810,1102,1505,1012,
                            1995,2001,1964,1992,1969};
        System.out.println("Actual String Array: " + Arrays.toString(places));
        Arrays.sort(places);                //Sort String Array
        System.out.println("Sorted String Array: " + Arrays.toString(places));
        System.out.println("Actual Numeric Array: " + Arrays.toString(birthdays));
        Arrays.sort(birthdays);             //Sort Numeric Array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(birthdays));

    }
}
