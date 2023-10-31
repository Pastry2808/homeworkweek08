/*
Declare multidimensional array and store 5 countries and their capital and print them in
console.
 */
package javaprograms;
public class Question03 {
    public static void main(String[] args) {
        Question03 capitals = new Question03();  //Object
        capitals.countries();  //Called Instance Method using Object
    }
    public void countries(){
        String [][] countrieswithcapitals = {{"India", "Delhi"},            //Multi-dimensional Array
                                             {"Australia", "Sydney"},
                                             {"USA", "Washington"},
                                              {"Canada", "Ottawa"},
                                                {"UK", "London"}};
        int i;
        for(i=0; i<= countrieswithcapitals.length-1; i++){              //For Loop
            System.out.println(i);
            System.out.println("Country Name: " + countrieswithcapitals[i][0]);
            System.out.println("Capital of the Country is: " + countrieswithcapitals[i][1]);
        }
    }
}
