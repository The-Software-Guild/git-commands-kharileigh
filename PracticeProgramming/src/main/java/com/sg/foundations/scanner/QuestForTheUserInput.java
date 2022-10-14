/**
 *
 * @author kharileigh
 * Quest For The User Input
 * Instructions :
 * take code below and type it into program
 * 
 */

package com.sg.foundations.scanner;

// IMPORT SCANNER
import java.util.Scanner;

public class QuestForTheUserInput {
    
    public static void main(String[] args) {
        
        // DECLARE & INTIALISE SCANNER
        Scanner inputReader = new Scanner(System.in);
        
        String myName = "Khari";
        String yourQuest;
        double velocityOfSwallow;
        
        // ASSIGN VALUE TO STRINGS USING SCANNER'S READLINE
        System.out.println("What is your name?? ");
        yourQuest = inputReader.nextLine();
        
        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();
        
        
        // FOR DOUBLE TYPE INPUT, CAN USE :
        // nextDouble() method OR Double.parseDouble to convert nextLine's Sting
        System.out.println("WHat is the airspeed velocity of an unladen swallow?!?1");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + myName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
     
    }
    
}
