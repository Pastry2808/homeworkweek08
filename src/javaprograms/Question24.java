/*
Write java program using for loop and print surname 9 times.
 */
package javaprograms;
public class Question24 {
    public static void main(String[] args) {
        Question24 lastname = new Question24();         //Object
        lastname.surname();
    }
    public void surname() {
        String name = "Khushbu Patel";
        int i;
        for (i = 1; i < 10; i++) {                  //For Loop
            System.out.println(name.substring(8));
            System.out.println(i);
        }
    }
}
