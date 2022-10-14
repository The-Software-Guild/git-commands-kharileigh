/**
 *
 * @author kharileigh
 * BestAdderEver
 * Instructions : 
 * write a program that does basic math
 * stores 3 different numbers in different variables
 * add those variables together and store in a new variable
 * display the result as a single math statement, like 1 + 2 + 3 + 4 = 6
 */

package com.sg.foundations.variables;


public class BestAdderEver {
    
    public static void main(String[] args) {
        
         // DECLARE & INITIALISE 3 INTEGER VARIABLES
        int pear = 5;
        int apple = 4;
        int jackfruit = 10;
        int sumOfFruits = pear + apple + jackfruit;

        System.out.print("The total cost of the fruits are: " + "£" + sumOfFruits );
    
    }
}
