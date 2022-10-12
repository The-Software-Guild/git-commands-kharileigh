
/**
 *
 * @author kharileigh
 * Program : Displays a different message based on the year someone was born to make them feel old.
 */

package com.sg.foundations.flowcontrol.ifs;

// IMPORT SCANNER
import java.util.Scanner;

public class YourLifeInMovies {
    
    public static void main(String[] args) {
        
        // Declare & initialise variable needer for birth year
        int birthYear;
        
        // Declare String variable for user input
        String stringBirthYear;
        
        // Declare & initialise Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Ask user to enter their birth year
        System.out.println("Please enter your birth year:");
        stringBirthYear = myScanner.nextLine();
        
        // Convert string value to integer value
        birthYear = Integer.parseInt(stringBirthYear);
        
        // Print statement if born before 2005 
        if(birthYear < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago!");
        }
        
        // Print statement if born before 1995
        if(birthYear < 1995) {
            System.out.println("The first Harry Potter came out over 15 years ago!");
        }
        
        // Print statement if born before 1985 
        if(birthYear < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT!");
        }
        
        // Print statement if born before 1975 
        if(birthYear < 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today!");
        }
        
        // Print statement if born before 1965
        if(birthYear < 1965) {
            System.out.println("The MASH TV series has been around for almost half a century!");
        }
    }
    
}
