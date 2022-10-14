/**
 *
 * @author kharileigh
 * Mini Mad Libs
 * Instructions :
 * Ask user for the following
 * noun, adjective, noun, number, adjective, plural noun x 3, verb present tense, same verb but past tense
 * Then substitute all the entered words into the following pass (in order)
 */

package com.sg.foundations.scanner;


// IMPORT SCANNER
import java.util.Scanner;

public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        // DECLARE ALL VARIABLES 
        String noun1;
        String adj1;
        String noun2;
        int num1;
        String adj2;
        String pluNoun1;
        String pluNoun2;
        String pluNoun3;
        String verbPres;
        String verbPast;
        
        // DECLARE & INITIALISE SCANNER
        Scanner entry = new Scanner(System.in);
        
        // PROMPT USER TO GET READY TO PLAY GAME
        System.out.println("Let's play MAD LIBS!");
        
        // ASK USER FOR ALL THE WORDS - prints statement & user input on same line
        System.out.print("I need a noun: ");
        noun1 = entry.nextLine();
        
        System.out.print("Now an adjective: ");
        adj1 = entry.nextLine();
        
        System.out.print("Another noun: ");
        noun2 = entry.nextLine();
        
        // PARSE INTEGER
        System.out.print("And a number: ");
        num1 = Integer.parseInt(entry.nextLine());
        
        System.out.print("Another adjective: ");
        adj2 = entry.nextLine();
        
        System.out.print("A plural noun: ");
        pluNoun1 = entry.nextLine();
        
        System.out.print("Another one: ");
        pluNoun2 = entry.nextLine();
        
        System.out.print("One more: ");
        pluNoun3 = entry.nextLine();
        
        System.out.print("A verb (infinite form): ");
        verbPres = entry.nextLine();
        
        System.out.print("Same verb (past principle): ");
        verbPast = entry.nextLine();
        
        // ADDS WHITESPACE BEFORE AND AFTER LINE IS PRINTED
        System.out.println("\n" + "**** NOW LET'S GET MAD (libs) ***" + "\n");
        
        
        System.out.print(noun1 + ": " + " the " + adj1 + " frontier." );
        System.out.print(" These are the voyages of the starship " + noun2 + ".");
        System.out.print("It's " + num1 + " year mission: to explore the strange " + adj1 + " " + pluNoun1 + ",");
        System.out.print(" to seek out " + adj1 + " " + pluNoun2 + " and " + adj1 + " " + pluNoun3 + ",");
        System.out.print(" to boldly " + verbPres + " where no one has " + verbPast + " before.");
        
    }
    
}
