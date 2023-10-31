/*
Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.
 */

package javaprograms;

public class Question14 {
    public static void main(String[] args) {
        Question14 divisibility = new Question14();     //Object
        divisibility.divisible();
    }
    public void divisible(){
        System.out.println("Numbers divisible by 3 are: ");
        for (int i=1; i<=100; i++){             //For Loop
            if (i % 3 == 0){                // if condition
                System.out.println(i);
            }
        }
        System.out.println("Numbers divisible by 5 are: ");
        for (int i=1; i<=100; i++){                 //For Loop
            if (i % 5 == 0){                    //if condition
                System.out.println(i);
            }
        }
    }

}
