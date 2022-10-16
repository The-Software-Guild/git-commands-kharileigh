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

public class LazyTeenager {
    
    public static void main(String[] args) {
        
        int request2Clean = 0;
        boolean isRoomDirty = true;
        int randomChance = randomNum(1, 7);
        
        
        // CONDITION TO EXECUTE REPEATEDLY :
        String mom = "CLEAN YOUR ROOM!!";
            
        // DO WHILE TO EXECUTE UNTIL ROOM IS CLEAN:
        // IF - more than 7, mom cleans room
        // ELSE IF - teen cleans room
        do {
            request2Clean += 1;
            System.out.println(mom + "(x" + request2Clean + ")");
           
            if (request2Clean > 7) {
                System.out.println(mom + " " + "That's IT! I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING AWAY YOUR XBOX");
            } else if (request2Clean <= 7 && request2Clean == randomChance) {
                System.out.println("FINE! I'LL CLEAN MY ROOM! BUT I REFUSE TO EAT MY PEAS!");
                isRoomDirty = false;
                break;
            }
        
        } while (isRoomDirty);
        
    }

    public static int randomNum(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}