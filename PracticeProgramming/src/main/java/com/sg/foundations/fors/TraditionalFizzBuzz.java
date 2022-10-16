/**
 *
 * @author kharileigh
 * Traditional Fizz Buzz
 * Instructions : Counts numbers, replacing the factors of 3 or 5 with fizz and buzz
 * ask user for a number
 * for loop - count from 0, replace 3 with "fizz", replace 5 with "buzz", replace multiples of BOTH with "fizzbuzz"
 * every time print any of these words keep track
 * when reached number received from user stop
 * finish with printout of "TRADITION!"
 */

package com.sg.foundations.fors;

// IMPORT RANDOM & SCANNER
import java.util.Random;
import java.util.Scanner;


public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        
        // INITIALISE BOTH RANDOM & SCANNER OBJECT 
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        
        int userNum;
        
        int fizz = 0;
        int buzz = 0;
        int fizzbuzz = 0;
        
        // ASK USER FOR A NUMBER
        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        userNum = Integer.parseInt(userInput.nextLine());
        
        // 
        
        // WHILE LOOP TO CHECK IF RANDOMLY GENERATED NUMBER
        for(int guess = 0; guess <= userNum; guess++) {
            System.out.println(guess);
        
            switch (guess) {
                case 1:
                    guess = 3;
                    fizz++;
                    System.out.println("fizz");
                    break;
                case 3:
                    guess = 5;
                    buzz++;
                    System.out.println("buzz");
                    break;
                default:
                    guess = 35;
                    fizzbuzz++;
                    System.out.println("fizzbuzz");
                    break;
            }
            
            if (guess == userNum || guess == userNum) {
                System.out.println(guess);
                break;
            }
        }
        
        System.out.println("TRADITION!!!!");
    }
    
}
