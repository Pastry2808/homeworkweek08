/*
Declare one method with return type and parameter and print your name in console.
 */
package javaprograms;
public class Question25 {
    public static void main(String[] args) {
        Question25 name1 = new Question25();            //Object
        System.out.println(name1.name("Khushbu Patel", "Patel"));
    }
    public String name(String firstname, String lastname){      //With return with parameters

        return firstname;
    }
}
