

/**
 *
 * @author kharileigh
 */

package com.sg.foundations.flowcontrol.ifs;

// IMPORT SCANNER
import java.util.Scanner;

public class GuessMe {
    
    public static void main(String[] args) {
        
        // Declare & initialise integer for user input & number to be guessed
        int guessNum;
        int correctNum = 4;
        
        // Declare String variable to hold user's input
        String stringGuessNum;
        
        // Declare & initialise Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Ask user to pick a number 
        System.out.println("Please pick a number:");
        stringGuessNum = myScanner.nextLine();
        
        // Convert string value of user input to integer value
        guessNum = Integer.parseInt(stringGuessNum);
        
        // Print statement if user input is equal
        if(guessNum == correctNum) {
            System.out.println("Wow, nice guess! That was it");
        }
        
        // Print statement if user input is less than correct number
        if(guessNum < correctNum) {
            System.out.println("Ha, nice try - too low! I chose 4.");
        }
        
        // Print statement if user input is greater than the correct number
        if(guessNum > correctNum) {
            System.out.println("Too bad, way too high. I chose 4.");
        }
    }
    
}
