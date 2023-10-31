/*
Declare array and store any 5 countries and print them in console.
 */
package javaprograms;
public class Question02 {
    public static void main(String[] args) {
        nations();
    }
        public static void nations() {          //Static Method
            String[] countries = {"India", "UK", "USA", "Canada", "Australia"};  //Array
            int i;
            System.out.println(countries);
            for(i=0; i<= countries.length-1; i++){          //For Loop
                System.out.println(countries[i]);
            }
    }
}
