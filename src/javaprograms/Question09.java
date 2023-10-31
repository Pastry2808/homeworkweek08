/*
Write java program using for loop and print your group name 10 times.
 */
package javaprograms;
public class Question09 {
    public static void main(String[] args) {
        groupName();
    }
    public static void groupName() {
        String name = "Agile";
        int i;
        for (i = 1; i <= 10; i++) {     //For Loop
            System.out.println(name);
            System.out.println(i);
        }
    }
}
