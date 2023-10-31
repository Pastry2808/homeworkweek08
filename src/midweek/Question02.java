/*
Print multiplication table of 24, 50 and 29 using loop.
 */

package midweek;

public class Question02 {
    public static void main(String[] args) {
        multiplication();
    }

    public static void multiplication() {
        int num1 = 24;
        int num2 = 50;
        int num3 = 29;
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d * %d = %d \n", num1, i, num1 * i);
        }
        System.out.println("====================================");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d * %d = %d \n", num2, i, num2 * i);
        }
        System.out.println("====================================");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d * %d = %d \n", num3, i, num3 * i);
        }
    }
}