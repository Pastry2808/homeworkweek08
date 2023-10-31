/*
Write java program using for loop and print your name 10 times.
 */
package javaprograms;
public class Question23 {
    public static void main(String[] args) {
        Question23 forloopname = new Question23();      //Object
        forloopname.name();
    }
    public void name() {
        String fullname = "Khushbu Patel";
        int i;
        for (i = 1; i <= 10; i++) {             //For Loop
            System.out.println(fullname);
            System.out.println(i);
        }
    }

}
