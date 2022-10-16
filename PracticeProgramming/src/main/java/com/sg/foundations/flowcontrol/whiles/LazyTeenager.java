/**
 *
 * @author kharileigh
 * Lazy Teenager 
 * Instructions : Write a program to practice do-whiles.
 * loop continues to execute until room is clean
 * each time loop executes, parent should tell teenager to clean their room
 * each time teenage is told, increases the chance of room being cleaned by 10% 
 * USE RANDOM TO CALCULATE THIS "CHANCE" CHECK
 * 7th time - they are getting grounded and Xbox confiscated 
 * USE BREAK TO STOP THE LOOP IN THAT CASE, NOT A COMPOUND CONDITION
 * 
 * 
 * CURRENTLY ONLY PRINTS ONCE - NEED HELP TO APPLY RANDOM PROBABILITY
 */

package com.sg.foundations.flowcontrol.whiles;

// IMPORT RANDOM & SCANNER
import java.util.Random;
import java.util.Scanner;

public class LazyTeenager {
    
    public static void main(String[] args) {
        
        int randomClean = 0;
        boolean isRoomClean = true;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        // CONDITION TO EXECUTE REPEATEDLY :
        String mom = "CLEAN YOUR ROOM!";
            
        // DO WHILE TO EXECUTE UNTIL ROOM IS CLEAN:
        do {
          
            System.out.println(mom);
            
            // TEEN RESPONSE
            String teenAnswer = scanner.next();
            
            if("no".equals(teenAnswer)) {
                isRoomClean = false;
                for (int i = 0; i <= 8; i++) {
                    randomClean = rand.nextInt();
                    randomClean++;
                }
            } 
        
        } while (randomClean < 7);
        
        // PRINT AFTER WHILE LOOP COMPLETES
        System.out.println(mom + " " + "That's IT! I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING AWAY YOUR XBOX");
        
    }
    
}

/*
         // CHILD RESPONSE TO CLEANING ROOM: 
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        teenAnswer = Boolean.parseBoolean(answer);
        

        // BOOLEAN TO  
        boolean isRoomClean;
        
        // RANDOM OBJECT TO GENERATE PROBABILITY TO SAMPLE AGAINST
        // increase by 10% = 0.1, but 7th time loop stops
        Random rand = new Random();
        
        
        if (isRoomClean = true) {
            for (double i = 0.0; i <= 0.7; i++) {
            randomClean = rand.nextDouble();
            randomClean++;
            }
        } else {
            isRoomClean = false;
        }
*/
        
