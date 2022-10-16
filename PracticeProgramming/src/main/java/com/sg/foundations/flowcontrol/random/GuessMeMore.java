/**
 *
 * @author kharileigh
 * Guess Me More
 * Instructions : 
 * Take your original number guessing program and improve it
 * - make the number chosen, a random number between -100 and 100
 * - if the user gets it wrong, give them another chance at guessing
 */

package com.sg.foundations.flowcontrol.random;

// IMPORT SCANNER
import java.util.Scanner;

public class GuessMeMore {
    
    public static void main(String[] args) {
        
        int userGuess;
        int secondGuess;
        
          // INITIALISE SCANNER
        Scanner scan = new Scanner(System.in);
        
        System.out.println("I've guessed a number between -100 and 100. Bet you can't guess it!");
        
        // GENERATE USER GUESS initialise i at -100, with bound 100
        for(int i = -100; i <= 101; i++) {
            userGuess = scan.nextInt();
            System.out.println("Your guess: " + userGuess);
            
            System.out.println("Ha, nice try - too low! Try again!");
          
            // SECOND GUESS
            for(int j = -100; j <= 101; j++) {
                secondGuess = scan.nextInt();
                System.out.println("Your guess: " + secondGuess);
            
                System.out.println("Wow, nice guess! That was it!");
            }
        }
    }
}
